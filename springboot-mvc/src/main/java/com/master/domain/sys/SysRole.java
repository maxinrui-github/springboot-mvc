package com.master.domain.sys;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Maxinrui
 * \* Date: 2019/6/6
 * \* Time: 9:52
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class SysRole implements Serializable {

    private static final long serialVersionUID = 5180869216498363919L;

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}