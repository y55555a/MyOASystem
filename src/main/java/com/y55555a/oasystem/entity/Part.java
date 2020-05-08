package com.y55555a.oasystem.entity;

import java.util.Date;

/**
 * @Author y55555a
 * Date on 2020/5/2  18:26
 *
 * 部门
 */
public class Part {

    private String name;
    private int id;
    private String createPerson;
    private Date createDate;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
