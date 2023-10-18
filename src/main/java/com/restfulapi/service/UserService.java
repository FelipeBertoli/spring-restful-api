package com.restfulapi.service;

import com.restfulapi.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
