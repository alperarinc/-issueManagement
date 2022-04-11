package com.issuesManagement.service;

import com.issuesManagement.entity.User;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;


public interface UserService {

    User save(User user);

    User getById(Long id);

    Page<User> getAllPageable(Pageable pageable);

    User getByUserName(String username);

}
