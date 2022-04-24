package com.issuesManagement.api;

import com.issuesManagement.service.impl.IssueServiceImpl;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/issue")
public class IssueController {

    private final IssueServiceImpl issueServiceImpl;

    public IssueController(IssueServiceImpl issueServiceImpl){
        this.issueServiceImpl = issueServiceImpl;

    }

    }
