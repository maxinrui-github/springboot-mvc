package com.master.repository.sys;

import com.master.domain.sys.SysPermission;
import com.master.domain.sys.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Maxinrui
 * \* Date: 2019/6/6
 * \* Time: 9:56
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Repository
public interface SysPermissionMapper {

    List<SysPermission> findAll();

    List<SysPermission> findByUserId(String userId);
}