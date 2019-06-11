package com.master.repository.sys;

import com.master.domain.sys.SysUserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Maxinrui
 * \* Date: 2019/6/6
 * \* Time: 9:57
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Repository
public interface SysUserRoleMapper {

    List<SysUserRole> listByUserId(String userId);
}