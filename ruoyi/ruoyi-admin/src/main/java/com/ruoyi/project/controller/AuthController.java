package com.ruoyi.project.controller;

import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.framework.web.service.SysLoginService;
import com.ruoyi.framework.web.service.TokenService;
import com.ruoyi.framework.web.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private SysLoginService loginService;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private TokenService tokenService;

    @RequestMapping("/token")
    public AjaxResult token(@RequestParam(name = "appid", required = true, defaultValue = "") String szAppId
            , @RequestParam(name = "secret", required = true, defaultValue = "") String szSecret) {
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        LoginUser loginUser = (LoginUser) userDetailsService.loadUserByUsername("admin");
        ajax.put(Constants.TOKEN, tokenService.createToken(loginUser));
        return ajax;
    }
}
