package com.g2appdev.teamnullpointer.service;

import com.g2appdev.teamnullpointer.entity.ProjectEntity;
import com.g2appdev.teamnullpointer.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<ProjectEntity> getAllProjects(){
        return prepo.findAll();
    }
}
