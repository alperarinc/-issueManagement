package com.issuesManagement.repo;

import com.issuesManagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IssueRepositroy extends JpaRepository<Issue, Long> {


}
