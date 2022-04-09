package com.issuesManagement.service;

import com.issuesManagement.entity.Issue;

import java.awt.print.Pageable;
import java.util.List;

public interface IssueService {

    Issue save(Issue issue);

    Issue getById(Long id);

    List<Issue> getAllPageable(Pageable pageable);



}
