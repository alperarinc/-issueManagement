package com.issuesManagement.api;

import com.issuesManagement.dto.ProjectDto;
import com.issuesManagement.service.impl.ProjectServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
@RequestMapping("/project")
public class ProjectController {

    private final ProjectServiceImpl projectServiceImpl;

    public ProjectController(ProjectServiceImpl projectServiceImpl){
        this.projectServiceImpl=projectServiceImpl;
    }

    //insert into project(id,project_name,project_code) values (60,'Test','T6060')

    @GetMapping("/{id}")
    public ResponseEntity<ProjectDto> getById(@PathVariable("id") Long id) {
        ProjectDto projectDto = projectServiceImpl.getById(id);
        return ResponseEntity.ok(projectDto);
    }

    @PostMapping()
    public ResponseEntity<ProjectDto> createProject(@Valid @RequestBody ProjectDto project){
      return ResponseEntity.ok(projectServiceImpl.save(project));
    }

    public ResponseEntity<ProjectDto> updateProject(@PathVariable("id") Long id,@Valid @RequestBody ProjectDto project){
        projectServiceImpl.
    }
}
