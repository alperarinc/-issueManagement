package com.issuesManagement.dto;

import com.issuesManagement.entity.IssueStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Issue Data Transfer Object")
public class IssueDto {
    @ApiModelProperty(value = "Project ID")
    private Long id;
    @ApiModelProperty(required = true,value = "Description Of Project")
    private String description;
    @ApiModelProperty(required = true,value = "Details Of Project")
    private String details;
    @ApiModelProperty(required = true,value = "Date Of Project")
    private Date date;
    @ApiModelProperty(required = true,value = "Status Of Project")
    private IssueStatus issueStatus;
    @ApiModelProperty(required = true,value = "Assignee Of Project")
    private UserDto assignee;
    @ApiModelProperty(required = true,value = "ProjectDto Of Project")
    private ProjectDto project;
    private Long projectId;

    public void setDate(java.util.Date date) {
    }
}
