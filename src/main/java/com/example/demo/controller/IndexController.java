package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {//获取cookie信息 查表判断user是否存在
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/")
    public String index(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        // 如果获取到Cookie:
        if (cookies != null) {
            // 循环每个Cookie:
            for (Cookie cookie : cookies) {
                // 如果Cookie名称为lang:
                if (cookie.getName().equals("token")) {
                    // 查表
                    User user = userMapper.findBYToken(cookie.getValue());
                    if(user!=null){
                        request.getSession().setAttribute("user",user);
                    }
                }
            }
        }
        return "index";
    }
}
