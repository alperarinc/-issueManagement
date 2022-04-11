package com.issuesManagement.service.impl;

import com.issuesManagement.entity.Issue;
import com.issuesManagement.entity.IssueHistory;
import com.issuesManagement.repositroy.IssueHistroyRepositroy;
import com.issuesManagement.service.IssueHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class IssueHistoryServiceImpl implements IssueHistoryService {

    public final IssueHistroyRepositroy issueHistroyRepositroy;

    public IssueHistoryServiceImpl(IssueHistroyRepositroy issueHistroyRepositroy){
        this.issueHistroyRepositroy = issueHistroyRepositroy;
    }


    @Override
    public IssueHistory save(IssueHistory issueHistory){
        if (issueHistory.getIssue() == null) {
            throw new IllegalArgumentException("Issue cannot be null");
        }
        issueHistory= issueHistroyRepositroy.save(issueHistory);
        return issueHistory;
    }

    @Override
    public IssueHistory getById(Long id) {
        return issueHistroyRepositroy.getOne(id);
    }

    @Override
    public Page<IssueHistory> getAllPageable(Pageable pageable) {
        return issueHistroyRepositroy.findAll(pageable);
    }

    @Override
    public Boolean delete(IssueHistory issueHistory) {
        issueHistroyRepositroy.delete(issueHistory);
        return Boolean.TRUE;
    }
}
