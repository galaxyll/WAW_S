package com.myblog.blog.controller;

import com.myblog.blog.error.BusinessException;
import com.myblog.blog.response.CommonReturnType;
import com.myblog.blog.error.EmBusinessError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 大天狗
 * 描述: 公共的Controller,内部定义一些使用比较广泛的方法
 */

public class BaseController {
    //使用注解创建自定义的异常信息处理类
    @ResponseBody //不要在返回丑丑的页面了，要返回有用的json串
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public Object handlerException(Exception ex){
        /*
         * 注意，不能直接将枚举类型的数据交给json解析，无法达到我们想要看其key-value形式的需求
         * 所以在这里我们将其转化为一个map，交给json解析
         */
        Map<String,Object> map = new HashMap<>(16);

        if(ex instanceof BusinessException){
            /*
             * 这里是我们后台最后对异常的处理逻辑，接下来就交给UI了，所以，我们要尽量提供一个有效
             * 可靠的异常数据。
             */
            BusinessException businessException = (BusinessException) ex;

            map.put("errStatus",businessException.getErrorStatus());

            map.put("errMsg",businessException.getErrorMsg());

        }else{
            map.put("errStatus", EmBusinessError.UNKNOW_EXCEPTION.getErrorStatus());
            map.put("errMsg",EmBusinessError.UNKNOW_EXCEPTION.getErrorMsg());

        }
        return CommonReturnType.create(map,"fail");
    }
}
