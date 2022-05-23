package com.issuesManagement.repository;

import com.issuesManagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProjectRepository extends JpaRepository<Project, Long> {

    Page<Project> findAll(Pageable pageable);

    List<Project> findAll(Sort sort);

    Project getById(Long id);

    Project getByProjectCodeAndIdNot(String ProjectCode, Long id);

    Project getByProjectCode(String projectCode);
}
