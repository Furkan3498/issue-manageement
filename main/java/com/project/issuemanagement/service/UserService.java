package com.project.issuemanagement.service;

import com.project.issuemanagement.dto.UserDto;
import com.project.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;


public interface UserService {

    UserDto save(UserDto user);

    UserDto getById(Long id);

    TPage<UserDto> getAllPageable(Pageable pageable);

    UserDto getByUsername(String username);
}
