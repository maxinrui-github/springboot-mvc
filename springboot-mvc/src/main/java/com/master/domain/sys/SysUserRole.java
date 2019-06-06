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
public class SysUserRole implements Serializable {

    static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer roleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}