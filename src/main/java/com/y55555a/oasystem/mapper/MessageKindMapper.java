package com.y55555a.oasystem.mapper;

import com.y55555a.oasystem.entity.MessageKind;

import java.util.List;

/**
 * @Author y55555a
 * Date on 2020/5/2  18:53
 */
public interface MessageKindMapper {

    //获取全部种类
    public List<MessageKind> getAllKinds();
}
