package com.issuesManagement.service.impl;

import com.issuesManagement.entity.User;
import com.issuesManagement.repositroy.UserRepositroy;
import com.issuesManagement.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class UserServiceImpl implements UserService {

    public final UserRepositroy userRepositroy;

    public UserServiceImpl(UserRepositroy userRepositroy){
        this.userRepositroy=userRepositroy;
    }

    @Override
    public User save(User user){
        if (user.getEmail() == null){
            throw new IllegalArgumentException("User email cannot be null");
        }
        return userRepositroy.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepositroy.getOne(id);
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable) {
        return userRepositroy.findAll(pageable);
    }

    @Override
    public User getByUserName(String username) {
        return userRepositroy.findByUserName(username);
    }
}
