package com.ey.tax.core.dao;

import com.ey.tax.entity.SysPermission;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhuji on 2/10/2018.
 */
@Repository
public interface PermissionDAO {
    List<SysPermission> findAll();

    List<SysPermission> findByAdminUserId(Long userId);
}
