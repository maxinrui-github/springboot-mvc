package com.master.domain.sys;

import com.master.domain.BaseEntity;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Maxinrui
 * \* Date: 2019/6/6
 * \* Time: 9:52
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class SysRole extends BaseEntity<Long> {

    private static final long serialVersionUID = 5180869216498363919L;

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}