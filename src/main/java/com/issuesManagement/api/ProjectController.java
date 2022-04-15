package com.issuesManagement.api;

import com.issuesManagement.dto.ProjectDto;
import com.issuesManagement.service.impl.ProjectServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {

/*
* Http Mettotları
*
* GET
* POST
* PUT
* DELETE
*
* */

    private final ProjectServiceImpl projectServiceImpl;

    public ProjectController(ProjectServiceImpl projectServiceImpl){
        this.projectServiceImpl=projectServiceImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectDto> getById(@PathVariable("id") Long id) {
        ProjectDto projectDto = projectServiceImpl.getById(id);
        return ResponseEntity.ok(projectDto);
    }
}
