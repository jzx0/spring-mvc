package com.wisely.highlight_spring4.domain;

/**
 * <内容说明>
 *
 * @author jiang.zhenxiong
 * created on 2018/4/26 11:42
 */
public class DemoObj {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DemoObj() {
    }

    public DemoObj(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
