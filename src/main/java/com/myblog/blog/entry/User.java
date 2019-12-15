package com.myblog.blog.entry;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author 大天狗
 */
public class User {
    /*
     * 用户id 主键自增
     */
    private Integer uid;

    @NotEmpty(message = "用户名不能为空")
    @Size(min = 6 ,max = 20 ,message = "用户名长度不能少于6或长于20")
    /*
     * 用户名
     */
    private String username;

    @NotEmpty(message = "邮箱不能为空")
    @Pattern(regexp = "^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+" +
            "(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$",message = "邮箱格式不正确")
    private String emil;

    @NotEmpty(message = "密码不能为空")
    @Size(min = 6 ,max = 20 ,message = "密码长度不能少于6或长于20")
    private String password;

    private String sex;
    private String school;
    private String name;
    private String college;
    private String signature;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public User() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(@NotEmpty(message = "用户名不能为空") @Size(min = 6, max = 20, message = "用户名长度不能少于6或长于20") String username, @NotEmpty(message = "邮箱不能为空") @Pattern(regexp = "^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+" +
            "(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$", message = "邮箱格式不正确") String emil, @NotEmpty(message = "密码不能为空") @Size(min = 6, max = 20, message = "密码长度不能少于6或长于20") String password) {
        this.username = username;
        this.emil = emil;
        this.password = password;
    }

    public User(Integer uid, @NotEmpty(message = "用户名不能为空") @Size(min = 6, max = 20, message = "用户名长度不能少于6或长于20") String username, @NotEmpty(message = "邮箱不能为空") @Pattern(regexp = "^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+" +
            "(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$", message = "邮箱格式不正确") String emil, @NotEmpty(message = "密码不能为空") @Size(min = 6, max = 20, message = "密码长度不能少于6或长于20") String password) {
        this.uid = uid;
        this.username = username;
        this.emil = emil;
        this.password = password;
    }

//    public User(User user,String s);

    public User(User user,String sex, String school, String name, String college, String signature) {
        this.uid=user.uid;
        this.username=user.username;
        this.emil = user.emil;
        this.password = user.password;
        this.sex = sex;
        this.school = school;
        this.name = name;
        this.college = college;
        this.signature = signature;
    }
}
