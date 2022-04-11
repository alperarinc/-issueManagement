package com.issuesManagement.service;

import com.issuesManagement.entity.Issue;
import com.issuesManagement.entity.IssueHistory;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;


public interface IssueHistoryService {

    IssueHistory save(IssueHistory issueHistory);

    IssueHistory getById(Long id);

    Page<IssueHistory> getAllPageable(Pageable pageable);

    Boolean delete(IssueHistory issueHistory);

}
