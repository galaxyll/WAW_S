package com.myblog.blog.utils;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;

/**
 * @author hasee
 */
public class JwtUtils {

    public static String createJWT(String id,String tse){
        JwtBuilder jwtBuilder= Jwts.builder();
        jwtBuilder.setId(id);
        jwtBuilder.setAudience("");
        return null;
    }
}
