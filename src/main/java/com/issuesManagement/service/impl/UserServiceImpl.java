package com.issuesManagement.service.impl;

import com.issuesManagement.entity.User;
import com.issuesManagement.repository.UserRepository;
import com.issuesManagement.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

@Service
public class UserServiceImpl implements UserService {

    public final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user){
        if (user.getEmail() == null){
            throw new IllegalArgumentException("User email cannot be null");
        }
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User getByUserName(String username) {
        return userRepository.findByUsername(username);
    }
}
