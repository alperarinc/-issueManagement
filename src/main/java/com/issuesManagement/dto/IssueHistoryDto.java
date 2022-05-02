package com.issuesManagement.dto;

import com.issuesManagement.entity.IssueStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "Issue Data Transfer Object")

public class IssueHistoryDto {
    @ApiModelProperty(value = "Project ID")
    private Long id;
    @ApiModelProperty(required = true,value = "Issue Of Project")
    private IssueDto issue;
    @ApiModelProperty(required = true,value = "Description Of Project")
    private String description;
    @ApiModelProperty(required = true,value = "Date Of Project")
    private Date date;
    @ApiModelProperty(required = true,value = "IssueStatus Of Project")
    private IssueStatus issueStatus;
    @ApiModelProperty(required = true,value = "Details Of Project")
    private String details;
    @ApiModelProperty(required = true,value = "Assignee Of Project")
    private UserDto assignee;

}
