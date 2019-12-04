package com.myblog.blog.controller;


import com.myblog.blog.controller.dto.UserRegisterDTO;
import com.myblog.blog.entry.User;
import com.myblog.blog.error.BusinessException;
import com.myblog.blog.error.EmBusinessError;
import com.myblog.blog.response.CommonReturnType;
import com.myblog.blog.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hasee
 */
@RestController
@RequestMapping("/blog/register")
@CrossOrigin(allowCredentials = "true" ,allowedHeaders = "*")
public class UserController extends BaseController{
    @Autowired
    UserService userService;

    @RequestMapping("/register")
    public CommonReturnType register(@RequestBody UserRegisterDTO userRegisterPTO
           ) throws BusinessException {
        if(userService.getUserByName(userRegisterPTO.getUsername())!=null){
            System.out.println(1);
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"用户已存在");
        }
        if(userService.getUserByEmil(userRegisterPTO.getEmail())!=null){
            System.out.println(2);
            throw new BusinessException(EmBusinessError.PARAMETER_IMAGE_ERROR,"邮箱已存在");
        }
        System.out.println(userRegisterPTO.getUsername());
        User user=new User();
        BeanUtils.copyProperties(userRegisterPTO,user);
        user.setEmil(userRegisterPTO.getEmail());
        System.out.println(3);
        userService.userRegister(user);
        System.out.println(4);
        return CommonReturnType.create(null);
    }
/**   @RequestMapping("/register1")
    public CommonReturnType register1(String username,String emil,String password
            , HttpServletRequest request) throws BusinessException {
        if(userService.GetUserByName(username)!=null){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"用户已存在");
        }
        if(userService.GetUserByEmil(emil)!=null){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"邮箱已存在");
        }
        User user=new User(username,emil,password);

        System.out.println(user);
        userService.UserRegister(user);
        return CommonReturnType.create(null);
    }
*/
    @RequestMapping("/login")
    public CommonReturnType login(@RequestBody UserRegisterDTO userRegisterPTO, HttpServletRequest request) throws BusinessException {
        System.out.println(userRegisterPTO.getUsername());
        User user=userService.getUserByName(userRegisterPTO.getUsername());
        System.out.println(userRegisterPTO);

/**System.out.println(request.getSession().getAttribute("verifyCode"));
        System.out.println(request.getSession().getId());
        if(!(userRegisterPTO.getCode()+"blog").toUpperCase().equals((request.getSession().getAttribute("verifyCode")).toString().toUpperCase()))
            return CommonReturnType.create(EmBusinessError.VERIFYCODE_MISTAKE_ERROR,"验证码错误");
       */

        if(user==null){
            throw new BusinessException(EmBusinessError.ILLEGAL_IMAGETYPE_ERROR,"未注册");
        }

        if(user.getPassword().equals(userRegisterPTO.getPassword())) {
            return CommonReturnType.create(null);
        }
        throw new BusinessException(EmBusinessError.ILLEGAL_IMAGETYPE_ERROR,"密码错误");
    }
}
