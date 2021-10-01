package com.example.demo.controller;

import com.example.demo.dto.AccessTokenDTO;
import com.example.demo.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class AuthorizeController {
    @Autowired
    private GithubProvider githubProvider;
    @GetMapping("/callback")
    public String callBack(@RequestParam(name="code") String code,@RequestParam(name="state") String state) throws IOException {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO("580dcac8de4966a31676","0cb78caa943e7e9c79e9ef0ccc3e50a8eb09877c",code,"http://localhost:8080/callback");
        String s = githubProvider.getAccessToken(accessTokenDTO);
        githubProvider.getUser(s);
        return "index";
    }
}
