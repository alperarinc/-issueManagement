package com.issuesManagement.repositroy;

import com.issuesManagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface UserRepositroy extends JpaRepository<User, Long> {
    Page<User> findAll(Pageable pageable);

    User findByUserName(String username);
}
