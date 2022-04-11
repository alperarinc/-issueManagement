package com.issuesManagement.dto;

import com.issuesManagement.entity.IssueStatus;
import lombok.Data;
import java.sql.Date;
@Data


public class IssueDto  {
    private Long id;
    private String description;
    private String destails;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assignee;
    private ProjectDto project;
}
