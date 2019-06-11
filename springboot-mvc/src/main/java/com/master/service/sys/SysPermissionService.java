package com.master.service.sys;

import com.master.domain.sys.SysPermission;
import com.master.repository.sys.SysPermissionMapper;
import com.master.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Maxinrui
 * \* Date: 2019/6/6
 * \* Time: 9:59
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service
public class SysPermissionService extends BaseService {

    @Autowired
    private SysPermissionMapper permissionMapper;

    public List<SysPermission> findAll() {
        return permissionMapper.findAll();
    }

    public List<SysPermission> findByUserId(String userId) {
        return permissionMapper.findByUserId(userId);
    }
/**
 * 获取当前菜单列表
 *
 * */
    public List<SysPermission> getPermission() {
        return this.findByUserId(getUserId());
    }
}