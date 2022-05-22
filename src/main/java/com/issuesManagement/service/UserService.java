package com.issuesManagement.service;

import com.issuesManagement.dto.UserDto;
import com.issuesManagement.util.TPage;
import org.springframework.data.domain.Pageable;


public interface UserService {

    UserDto save(UserDto user);

    UserDto getById(Long id);

    TPage<UserDto> getAllPageable(Pageable pageable);

    UserDto getByUsername(String username);

}
