package com.myblog.blog.response;/**


/**
 ClassName:CommonReturnType
 * @author 大天狗
 * 返回个前端的数据，携带一个前端可解析与辨识的标记
 */

public class CommonReturnType {


    //这个状态代表后台是否正常的产生了需要提供给前端的数据，如果后台在处理生成数据时发生了错误
    //改装态就会被置为fail，前端人员就可以根据该状态判断错误发生的位置，也就是有效信息
    private String status;

    private Object data;

    public CommonReturnType() {
    }

    public CommonReturnType(String status, Object data) {
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    //状态如果未提供则默认为success，当让你也可以提供为fail
    public static CommonReturnType create(Object result){
        return create(result,"success");
    }

    public static CommonReturnType create(Object result,String status){
        return new CommonReturnType(status,result);
    }
}
