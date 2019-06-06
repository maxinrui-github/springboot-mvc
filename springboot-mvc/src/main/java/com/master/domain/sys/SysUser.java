package com.master.domain.sys;

import com.master.domain.BaseEntity;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Maxinrui
 * \* Date: 2019/6/6
 * \* Time: 9:50
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class SysUser extends BaseEntity<Long> {

    private static final long serialVersionUID = 4180869216498363919L;

    private String name;

    private String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}