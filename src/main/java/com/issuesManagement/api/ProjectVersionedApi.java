package com.issuesManagement.api;


import com.issuesManagement.dto.ProjectDto;
import com.issuesManagement.service.impl.ProjectServiceImpl;
import com.issuesManagement.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/versioning")
@Api(value = ApiPaths.IssueCtrl.CTRL,description = "Issue APIs")
public class ProjectVersionedApi {

    @Autowired
    private ProjectServiceImpl projectServiceImpl;


    @GetMapping(value = "/{id}",params = "version=1")
    @ApiOperation(value = "Get By Id Operation v1",response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getByIdV1(@PathVariable(value = "id", required = true) Long id) {
        ProjectDto projectDto = projectServiceImpl.getById(id);
        return ResponseEntity.ok(projectDto);
    }

    @GetMapping(value = "/{id}",params = "version=2")
    @ApiOperation(value = "Get By Id Operation v1",response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getByIdV2(@PathVariable(value = "id", required = true) Long id) {
        ProjectDto projectDto = projectServiceImpl.getById(id);
        return ResponseEntity.ok(projectDto);
    }


}
