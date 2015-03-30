package com.test.project.dao.user;

import com.test.project.dao.Dao;
import com.test.project.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserDao extends Dao<User, Long>, UserDetailsService
{

    User findByName(String name);

}
