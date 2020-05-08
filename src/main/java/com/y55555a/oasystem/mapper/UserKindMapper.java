package com.y55555a.oasystem.mapper;

import com.y55555a.oasystem.entity.UserKind;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author y55555a
 * Date on 2020/5/2  19:02
 */
public interface UserKindMapper {

    //返回所有用户类型
    public List<UserKind> getAllUserKind();
    //根据ID获取名字
    public String getNameById(@Param("id")int id);
}
