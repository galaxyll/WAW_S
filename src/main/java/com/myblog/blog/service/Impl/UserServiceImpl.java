package com.myblog.blog.service.Impl;

import com.myblog.blog.dao.UserServiceDao;
import com.myblog.blog.entry.User;
import com.myblog.blog.error.BusinessException;
import com.myblog.blog.error.EmBusinessError;
import com.myblog.blog.service.UserService;
import com.myblog.blog.validate.validatorImpl;
import com.myblog.blog.validate.validatorResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserServiceDao userServiceDao;

    @Autowired
    private validatorImpl validator;
    @Override
    public void UserRegister(User user) throws BusinessException {
        validatorResult result = validator.validate(user);
        if(result.isHasError()){
            throw new BusinessException(EmBusinessError.ILLEGAL_IMAGETYPE_ERROR,result.getErrorMsg());
        }
        userServiceDao.insert_user(user);
    }

    @Override
    public User GetUserByName(String username) {
        return userServiceDao.select_from_name(username);
    }

    @Override
    public User GetUserByEmil(String email) {
        return userServiceDao.select_from_email(email);
    }
}
