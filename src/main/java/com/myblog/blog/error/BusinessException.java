package com.myblog.blog.error;

/**
 ClassName:BusinessException
 * @author 大天狗
 * 异常类
 */

public class BusinessException extends Exception implements CommonError{

    /**
     * 强关联一个枚举类型的异常类
     */
    private EmBusinessError emBusinessError;

    public BusinessException(EmBusinessError emBusinessError){
        super();
        this.emBusinessError = emBusinessError;
    }

    public BusinessException(EmBusinessError emBusinessError,String msg){
        super();
        this.emBusinessError = emBusinessError;
        this.emBusinessError.setErrorMsg(msg);
    }
    @Override
    public String getErrorMsg() {
        return this.emBusinessError.getErrorMsg();
    }

    @Override
    public int getErrorStatus() {
        return this.emBusinessError.getErrorStatus();
    }

    @Override
    public CommonError setErrorMsg(String msg) {
        return this.emBusinessError.setErrorMsg(msg);
    }
}
