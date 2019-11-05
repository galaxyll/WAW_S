package com.myblog.blog.controller;
import com.myblog.blog.controller.ControllerVo.VerifyCodeVo;
import com.myblog.blog.response.CommonReturnType;
import com.myblog.blog.validate.createVerifyCode;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;



@RestController
@RequestMapping("/blog/register")
@CrossOrigin(allowCredentials="true",allowedHeaders="*")
public class VerifyCodeController extends BaseController {


    public static void main(String[] args) {
    }

    @RequestMapping("/getVerifyCode")
    public CommonReturnType getVerifyCode(HttpServletRequest request, HttpServletResponse response) throws Exception {
        createVerifyCode code = new createVerifyCode();
        BufferedImage image = code.getImage();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        createVerifyCode.output(image,baos);

        //String realPath = request.getSession().getServletContext().getRealPath("/");

        //System.out.println(realPath);

        byte[] bytes = baos.toByteArray();
        //FileOutputStream fos = new FileOutputStream(realPath+ "pics/pic.jpg");
        //response.getOutputStream().write(bytes);
        //进行饭序列换，将字符串重新变换为二进制字节流
        //fos.write(bytes);
        //fos.flush();
        //fos.close();
        VerifyCodeVo verifyCodeVo = new VerifyCodeVo(code.getText(),bytes,request.getSession().getId());
        request.getSession().setAttribute("verifyCode",code.getText()+"blog");
        System.out.println("vCode"+request.getSession().getAttribute("verifyCode"));
        System.out.println(request.getSession().getId());

        return CommonReturnType.create(verifyCodeVo);
    }

}
