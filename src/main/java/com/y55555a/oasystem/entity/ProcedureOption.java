package com.y55555a.oasystem.entity;

/**
 * @Author y55555a
 * Date on 2020/5/2  18:33
 *
 * 提交的流程的选项
 */
public class ProcedureOption {

    private int id;
    private int procedureId;
    private String title;
    private String content;
    private int order;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getProcedureId() {
        return procedureId;
    }
    public void setProcedureId(int procedureId) {
        this.procedureId = procedureId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getOrder() {
        return order;
    }
    public void setOrder(int order) {
        this.order = order;
    }
    @Override
    public String toString() {
        return "ProcedureOption [id=" + id + ", procedureId=" + procedureId + ", title=" + title + ", content="
                + content + ", order=" + order + "]";
    }

}
