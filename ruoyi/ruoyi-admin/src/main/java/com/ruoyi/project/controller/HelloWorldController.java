package com.ruoyi.project.controller;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.project.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @create 2021/11/2 15:23
 * @Author hyl
 */
@RestController
@RequestMapping("/test")
public class HelloWorldController {

    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping("/helloWorld")
    public AjaxResult helloWorld() {
        HashMap<String, Integer> mapGameInfo = new HashMap<>();
        mapGameInfo.put("gameUserCount", helloWorldService.gameUserCount());
        mapGameInfo.put("gameStageCount", helloWorldService.stageCount());
        mapGameInfo.put("gameUserCountPlus", helloWorldService.gameUserCountPlus());

        return AjaxResult.success(mapGameInfo);
    }

}
