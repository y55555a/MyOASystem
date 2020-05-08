package com.y55555a.oasystem.entity;

/**
 * @Author y55555a
 * Date on 2020/5/2  18:35
 *
 *消息关联用户
 */
public class Remind {

    private int id;
    private int remindId;
    private boolean isMes;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getRemindId() {
        return remindId;
    }
    public void setRemindId(int remindId) {
        this.remindId = remindId;
    }
    public boolean isMes() {
        return isMes;
    }
    public void setMes(boolean isMes) {
        this.isMes = isMes;
    }
}
