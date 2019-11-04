package com.myblog.blog.error;

/**
 * ClassName:EmBusinessError
 * Package:com.sdp.kill.error
 * Description:Everything Is
 * Possible!
 *
 * @Date:2019/3/24 16:38
 * @Author:"15029155474@163.com"
 */

//所有对应异常的枚举类型
public enum EmBusinessError implements CommonError {

    //通用的错误类型，用户参数传递错误（注意这里的参数可以时任意一个参数而不是指定的）
    PARAMETER_VALIDATION_ERROR("输入参数不合法",10001),
    PARAMETER_IMAGE_ERROR("输入参数不合法",10002),
    ILLEGAL_IMAGETYPE_ERROR("输入参数不合法",10003),
    VERIFYCODE_MISTAKE_ERROR("验证码不正确",10004),
    REPEAT_SIGNUP_ERROR("该用户已经报名，不可重复报名",10005),
    UNKNOW_EXCEPTION("未知异常",30001),
    ;


    //枚举类型包含的成员变量
    private String ErrorMsg;
    //错误信息的状态码
    private int status;

    EmBusinessError(String errorMsg, int status) {
        this.ErrorMsg = errorMsg;
        this.status = status;
    }

    @Override
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    @Override
    public int getErrorStatus() {
        return this.status;
    }

    @Override
    public CommonError setErrorMsg(String msg) {
       this.ErrorMsg = msg;
       return this;
    }
}
