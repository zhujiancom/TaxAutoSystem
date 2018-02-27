package com.ey.tax.core.repository;

import com.ey.tax.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhuji on 2/10/2018.
 */
@Repository
public interface SysUserRepository extends JpaRepository<SysUser,Long> {
    SysUser findByUserName(String username);
}
