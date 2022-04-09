package com.issuesManagement.repositroy;

import com.issuesManagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistroyRepositroy extends JpaRepository<IssueHistory, Long> {
}
