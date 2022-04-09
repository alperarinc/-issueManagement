package com.issuesManagement.repo;

import com.issuesManagement.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProjectRepositroy extends JpaRepository<Project, Long> {

    List<Project> getAllByProjectCode(String projectCode);

    List<Project> getAllByProjectCodeAndIdNotNull(String projectCode);

    List<Project> getAllByProjectCodeAndProjectNameContains(String projectCode,String name);
}
