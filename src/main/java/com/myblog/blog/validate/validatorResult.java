package com.myblog.blog.validate;/**
 * ClassName:validatorResult
 * Package:com.sdp.kill.validatorResult
 * Description:Everything Is
 * Possible!
 *
 * @Date:2019/3/26 10:18
 * @Author:"15029155474@163.com"
 */

import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 ClassName:validatorResult
 */

public class validatorResult {

    private boolean hasError;

    private Map<String,String> ErrorMap;


    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }


    public Map<String, String> getErrorMap() {
        return ErrorMap;
    }

    public void setErrorMap(Map<String, String> errorMap) {
        ErrorMap = errorMap;
    }

    public String getErrorMsg(){
        //将所有错误组装成一个以逗号分隔开来的String字符串
        String errorMsg = StringUtils.join(ErrorMap.values().toArray(),",");
        return errorMsg;
    }

}
