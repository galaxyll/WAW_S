package com.myblog.blog.error;

/**
 * ClassName:CommonError
 * Package:com.sdp.kill.error
 * Description:Everything Is
 * Possible!
 *
 * @Date:2019/3/24 16:35
 * @Author:"15029155474@163.com"
 */

//这个接口，很神秘
public interface CommonError {
    public String getErrorMsg();
    public int getErrorStatus();
    public CommonError setErrorMsg(String msg);
}
