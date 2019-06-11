package com.master.repository.sys;

import com.github.pagehelper.Page;
import com.master.domain.sys.SysUser;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Maxinrui
 * \* Date: 2019/6/6
 * \* Time: 9:54
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Repository
public interface SysUserMapper {

    SysUser getById(String id);

    SysUser getByName(String name);

    Page<SysUser> findPageList();
}