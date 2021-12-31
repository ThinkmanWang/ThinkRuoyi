package com.ruoyi.project.mapper;

import com.ruoyi.common.annotation.DataSource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @create 2021/11/2 17:45
 * @Author hyl
 */
@Mapper
public interface HelloWorldMapper {

    @Select("SELECT COUNT(1) FROM t_base_game_user")
    public int gameUserCount();

    @Select("SELECT COUNT(1) FROM t_game_stage")
    public int stageCount();
}
