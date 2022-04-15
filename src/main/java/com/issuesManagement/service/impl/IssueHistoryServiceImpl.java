package com.issuesManagement.service.impl;


import com.issuesManagement.entity.IssueHistory;
import com.issuesManagement.repository.IssueHistroyRepository;
import com.issuesManagement.service.IssueHistoryService;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;


@Service
public class IssueHistoryServiceImpl implements IssueHistoryService {


    public final IssueHistroyRepository issueHistroyRepository;

    public IssueHistoryServiceImpl(IssueHistroyRepository issueHistroyRepository) {
        this.issueHistroyRepository = issueHistroyRepository;
    }

    @Override
    public IssueHistory save(@NotNull IssueHistory issueHistory) {
        if (issueHistory.getIssue() == null) {
            throw new IllegalArgumentException("Issue cannot be null");
        }
        issueHistory = issueHistroyRepository.save(issueHistory);
        return issueHistory;
    }

    @Override
    public IssueHistory getById(Long id) {
        return null;
    }

    @Override
    public Page<IssueHistory> getAllPageable(Pageable pageable) {
        return issueHistroyRepository.findAll(pageable);
    }


    @Override
    public Boolean delete(IssueHistory issueHistory) {
        issueHistroyRepository.delete(issueHistory);
        return Boolean.TRUE;
    }
}
