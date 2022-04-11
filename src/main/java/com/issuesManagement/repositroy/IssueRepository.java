package com.issuesManagement.repositroy;

import com.issuesManagement.entity.Issue;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;



public interface IssueRepository extends JpaRepository<Issue, Long> {

    Page<Issue> findAll(Pageable pageable);
}
