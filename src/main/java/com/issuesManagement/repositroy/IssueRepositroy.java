package com.issuesManagement.repositroy;

import com.issuesManagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;


public interface IssueRepositroy extends JpaRepository<Issue, Long> {


    List<Issue> findAll(Pageable pageable);
}
