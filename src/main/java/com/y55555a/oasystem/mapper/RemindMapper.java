package com.y55555a.oasystem.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @Author y55555a
 * Date on 2020/5/2  19:00
 */
public interface RemindMapper {

    //添加提醒
    public int addRemind(@Param("msgId")int msgId, @Param("remindId")String remindId, @Param("isMsg")int isMsg);
    //删除一个提醒
    public int delRemindById(@Param("msgId")int msgId,@Param("remindId")String remindId,@Param("isMsg")int isMSg);
    //查找这个提醒是否存在
    public int hasThisRemind(@Param("msgId")int msgId,@Param("remindId")String remindId,@Param("isMsg")int isMSg);
    //获取某个人需要提醒的消息或公告ID数
    public int getNeedToRemindNumber(@Param("isMsg")int isMSg,@Param("remindId")String remindId);

}
