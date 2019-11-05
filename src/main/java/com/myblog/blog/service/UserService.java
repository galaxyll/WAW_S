package com.myblog.blog.service;

import com.myblog.blog.entry.User;
import com.myblog.blog.error.BusinessException;
import org.springframework.stereotype.Service;


public interface UserService {
    void UserRegister(User user) throws BusinessException;

    User GetUserByName(String username);

    User GetUserByEmil(String email);
}
