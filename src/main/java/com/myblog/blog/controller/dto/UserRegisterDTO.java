package com.myblog.blog.controller.dto;

import java.io.Serializable;

/**
 * @author 大天狗
 */
public class UserRegisterDTO implements Serializable {
    private String username;
    private String email;
    private String password;
    private String code;

    @Override
    public String toString() {
        return "UserRegisterDTO{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UserRegisterDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserRegisterDTO(String username, String email, String password, String code) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.code = code;
    }

    public UserRegisterDTO() {
    }

    public UserRegisterDTO(String username, String email, String password) {
        this.username = username;
        this.email = null; //TODO email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
