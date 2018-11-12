package com.cmbchina;

/**
 * Created with IntelliJ IDEA.
 * com.cmbchina.User: ZhongYu Rong
 * Date: 2017/11/22
 * Time: 13:48
 */
public class Greeting {
    private long id;
    private String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
