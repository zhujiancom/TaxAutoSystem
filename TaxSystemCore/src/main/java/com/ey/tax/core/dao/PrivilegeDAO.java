package com.ey.tax.core.dao;

import com.ey.tax.entity.SysPermission;
import com.ey.tax.entity.SysRole;
import com.ey.tax.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhuji on 3/26/2018.
 */
@Repository
public interface PrivilegeDAO {
    List<SysRole> findRolesByUser(Long userId);

    List<SysPermission> findPermissionsByRole(Long roleId);
}
