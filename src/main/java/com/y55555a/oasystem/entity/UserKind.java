package com.y55555a.oasystem.entity;

/**
 * @Author y55555a
 * Date on 2020/5/2  18:37
 *
 * 用户类型
 */
public class UserKind {

    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserKind{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
