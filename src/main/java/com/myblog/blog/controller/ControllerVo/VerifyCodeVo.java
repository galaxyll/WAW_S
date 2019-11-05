package com.myblog.blog.controller.ControllerVo;

public class VerifyCodeVo {

    private String text;

    private byte[] image;

    private String JSESSIONID;

    public String getJSESSIONID() {
        return JSESSIONID;
    }

    public void setJSESSIONID(String JSESSIONID) {
        this.JSESSIONID = JSESSIONID;
    }

    public VerifyCodeVo(String text, byte[] image, String JSESSIONID) {
        this.text = text;
        this.image = image;
        this.JSESSIONID = JSESSIONID;
    }

    public VerifyCodeVo(String text, byte[] image) {
        this.text = text;
        this.image = image;
    }

    public VerifyCodeVo() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
