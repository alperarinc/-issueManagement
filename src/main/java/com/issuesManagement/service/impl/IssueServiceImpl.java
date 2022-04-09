package com.issuesManagement.service.impl;

import com.issuesManagement.entity.Issue;
import com.issuesManagement.repositroy.IssueRepositroy;
import com.issuesManagement.service.IssueService;

import java.awt.print.Pageable;
import java.util.List;

public class  IssueServiceImpl implements IssueService {

    private final IssueRepositroy issueRepositroy;

    public IssueServiceImpl(IssueRepositroy issueRepositroy){
        this.issueRepositroy=issueRepositroy;
    }


    @Override
    public Issue save(Issue issue) {
        return issueRepositroy.save(issue);
    }

    @Override
    public Issue getById(Long id) {
        return issueRepositroy.getById(id);
    }

    @Override
    public List<Issue> getAllPageable(Pageable pageable) {
        return issueRepositroy.findAll(pageable);
    }

}
