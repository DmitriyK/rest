package com.test.project.service;

import com.test.project.domain.User;

import java.util.List;

public interface UserService {

    User getUserByUsername(String username);

    List<String> getPermissions(String username);

    Boolean isCurrentUserLoggedIn();
}
