package com.issuesManagement.service;

import com.issuesManagement.entity.Issue;

import java.awt.print.Pageable;
import java.util.List;

public interface UserService {

    UserService save(UserService userService);

    Issue getById(Long id);

    List<Issue> getAllPageable(Pageable pageable);

}
