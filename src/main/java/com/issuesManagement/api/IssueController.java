package com.issuesManagement.api;


import com.issuesManagement.dto.IssueDto;
import com.issuesManagement.service.impl.IssueServiceImpl;
import com.issuesManagement.util.ApiPaths;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping(ApiPaths.IssueCtrl.CTRL)
public class IssueController {

    private final IssueServiceImpl issueServiceImpl;

    public IssueController( IssueServiceImpl issueServiceImpl) {
        this.issueServiceImpl = issueServiceImpl;

    }

    //insert into project(id,project_name,project_code) values (60,'Test','T6060')
    //insert into issue(id,description,date) values (9999,'test',now())
    @GetMapping("/{id}")
    public ResponseEntity<IssueDto> getById(@PathVariable(value = "id", required = true) Long id) {
        IssueDto issueDto = issueServiceImpl.getById(id);
        return ResponseEntity.ok(issueDto);
    }

    @PostMapping()
    public ResponseEntity<IssueDto> createProject(@Valid @RequestBody IssueDto issue) {
        return ResponseEntity.ok(issueServiceImpl.save(issue));
    }

    @PutMapping("/{id}")
    public ResponseEntity<IssueDto> updateProject(@PathVariable(value = "id", required = true) Long id, @Valid @RequestBody IssueDto issue) {
        return ResponseEntity.ok(issueServiceImpl.update(id, issue));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok(issueServiceImpl.delete(id));

    }

}
