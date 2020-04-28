package com.ruoyi.project.api.controller;

import com.ruoyi.common.constant.Constants;
import com.ruoyi.framework.security.service.SysLoginService;
import com.ruoyi.framework.web.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private SysLoginService loginService;

    @PostMapping("/api/auth")
    public AjaxResult auth(@RequestParam(name = "appid", required = true) String szAppId
            , @RequestParam(name = "secret", required = true) String szSecret)
    {
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        String token = loginService.auth(szAppId, szSecret);
        ajax.put(Constants.TOKEN, token);
        return ajax;
    }
}
