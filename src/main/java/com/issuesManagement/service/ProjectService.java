package com.issuesManagement.service;

import com.issuesManagement.entity.Project;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ProjectService {

    Project save(Project project);

    Project getById(Long id);

    List<Project> getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete (Project project);

}
