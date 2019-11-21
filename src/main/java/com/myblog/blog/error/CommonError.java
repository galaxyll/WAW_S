package com.myblog.blog.error;


/**
 * @author 大天狗
 * @date :2019/3/24 16:35
 * 这个接口，很神秘
 */
public interface CommonError {
    /**
     * 获取错误信息
     * @return String
     */
    public String getErrorMsg();

    /**
     * 获取错误状态
     * @return int 错误码
     */
    public int getErrorStatus();

    /**
     * 设置错误信息并返回该初始化了错误信息的常见错误类实例
     * @param msg 错误信息
     * @return CommonError
     */
    public CommonError setErrorMsg(String msg);
}
