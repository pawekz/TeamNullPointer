package com.g2appdev.teamnullpointer.controller;

import com.g2appdev.teamnullpointer.entity.ProjectEntity;
import com.g2appdev.teamnullpointer.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(method = RequestMethod.GET, path = "/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    //test
    @GetMapping("/print")
    public String print() {
        return "Project Controller";
    }
    //CREATE
    @PostMapping("/postprojectrecord")
    public ProjectEntity postProjectRecord(@RequestBody ProjectEntity project) {
        return projectService.postProjectRecord(project);
    }
    //READ ALL
    @GetMapping("/getprojectrecords")
    public Iterable<ProjectEntity> getProjectRecords() {
        return projectService.getProjectRecords();
    }
    //UPDATE
    @PutMapping("/updateprojectrecord")
    public ProjectEntity putProjectDetails(@RequestParam int id, @RequestBody ProjectEntity newProjectDetails){
        return projectService.putProjectDetails(id, newProjectDetails);
    }
    //DELETE
    @DeleteMapping("/deleteprojectdetails/{id}")
    public String deleteProjectDetails(@PathVariable int id) {
        return projectService.deleteProject(id);
    }
}
