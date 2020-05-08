package com.y55555a.oasystem.entity;

import java.util.Date;

/**
 * @Author y55555a
 * Date on 2020/5/2  18:21
 *
 * 小组
 */
public class Group {

    int id;
    int partId;
    String name;
    String createPerson;
    Date createDate;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPartId() {
        return partId;
    }
    public void setPartId(int partId) {
        this.partId = partId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCreatePerson() {
        return createPerson;
    }
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
