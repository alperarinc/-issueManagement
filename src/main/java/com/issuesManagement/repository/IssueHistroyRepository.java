package com.issuesManagement.repository;

import com.issuesManagement.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;



public interface IssueHistroyRepository extends JpaRepository<IssueHistory, Long> {
  Page<IssueHistory> findAll(Pageable pageable);
}
