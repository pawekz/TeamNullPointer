package com.g2appdev.teamnullpointer.service;

import com.g2appdev.teamnullpointer.entity.ProjectEntity;
import com.g2appdev.teamnullpointer.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.NameNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProjectService {
    @Autowired
    ProjectRepository prepo;

    public ProjectService(){
        super();
    }

    public ProjectEntity postProjectRepository(ProjectEntity project){
        return prepo.save(project);
    }

    public List<ProjectEntity> getAllProject(){
        return prepo.findAll();
    }

    public ProjectEntity postProjectRecord(ProjectEntity project) {
        return prepo.save(project);
    }

    public List<ProjectEntity> getProjectRecords() {
        return prepo.findAll();
    }

    @SuppressWarnings("finally")
    public ProjectEntity putProjectDetails(int id, ProjectEntity newProjectDetails){
        ProjectEntity project = new ProjectEntity();

        try {
            project = prepo.findById(id).get();

            project.setPname(newProjectDetails.getPname());
            project.setMembers(newProjectDetails.getMembers());
            project.setInstructorId(newProjectDetails.getInstructorId());
            project.setEndDate(newProjectDetails.getEndDate());

        } catch (NoSuchElementException e) {
            throw new NameNotFoundException("Project with id " + id + " not found");
        }finally{
            return prepo.save(project);
        }
    }

    public String deleteProject(int id){
        String msg = "";
        if (prepo.findById(id) != null){
            prepo.deleteById(id);
            msg = "Successfully deleted the project";
        }
        else{
            msg = "Project with id " + id + " not found";
        }
        return msg;
    }
}

