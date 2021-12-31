package com.ruoyi.project.service;

import com.ruoyi.common.annotation.DataSource;
import com.ruoyi.common.enums.DataSourceType;
import com.ruoyi.project.mapper.HelloWorldMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    @Autowired
    HelloWorldMapper helloWorldMapper;

    public int gameUserCountPlus() {
        return helloWorldMapper.gameUserCount();
    }

    @DataSource(DataSourceType.MASTER)
    public int gameUserCount() {
        return helloWorldMapper.gameUserCount();
    }

    @DataSource(DataSourceType.SLAVE)
    public int stageCount() {
        return helloWorldMapper.stageCount();
    }
}
