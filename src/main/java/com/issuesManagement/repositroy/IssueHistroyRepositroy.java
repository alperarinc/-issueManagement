package com.issuesManagement.repositroy;

import com.issuesManagement.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface IssueHistroyRepositroy extends JpaRepository<IssueHistory, Long> {
    Page<IssueHistory> findAll(Pageable pageable);
}
