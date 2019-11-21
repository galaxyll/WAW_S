package com.myblog.blog.service;

import com.myblog.blog.entry.User;
import com.myblog.blog.error.BusinessException;
import org.springframework.stereotype.Service;


public interface UserService {
    void userRegister(User user) throws BusinessException;

    User getUserByName(String username);

    User getUserByEmil(String email);
}
