package com.myblog.blog.entry;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
    private Integer uid;//用户id 主键自增

    @NotEmpty(message = "用户名不能为空")
    @Size(min = 6 ,max = 20 ,message = "用户名长度不能少于6或长于20")
    private String username;//用户名

    @NotEmpty(message = "邮箱不能为空")
    @Pattern(regexp = "^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+" +
            "(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$",message = "邮箱格式不正确")
    private String emil;

    @NotEmpty(message = "密码不能为空")
    @Size(min = 6 ,max = 20 ,message = "密码长度不能少于6或长于20")
    private String password;

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
}
