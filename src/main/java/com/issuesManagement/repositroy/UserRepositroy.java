package com.issuesManagement.repositroy;

import com.issuesManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositroy extends JpaRepository<User, Long> {
}
