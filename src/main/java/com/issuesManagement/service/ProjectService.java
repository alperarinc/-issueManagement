package com.issuesManagement.service;

import com.issuesManagement.entity.Issue;
import org.springframework.security.core.parameters.P;

import java.awt.print.Pageable;
import java.util.List;

public interface ProjectService {

    ProjectService save(ProjectService projectService);

    Issue getById(Long id);

    List<Issue> getAllPageable(Pageable pageable);

}
