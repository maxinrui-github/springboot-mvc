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

    private String userId;

    private String roleId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}