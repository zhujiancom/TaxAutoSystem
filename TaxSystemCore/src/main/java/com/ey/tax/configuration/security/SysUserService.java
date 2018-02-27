package com.ey.tax.configuration.security;

import com.ey.tax.core.dao.PermissionDAO;
import com.ey.tax.core.repository.SysUserRepository;
import com.ey.tax.entity.SysPermission;
import com.ey.tax.entity.SysUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuji on 2/10/2018.
 */
public class SysUserService implements UserDetailsService {
    @Autowired
    SysUserRepository sysUserRepository;

    @Autowired
    PermissionDAO permissionDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = sysUserRepository.findByUserName(username);
        if(user != null){
            List<SysPermission> permissions = permissionDAO.findByAdminUserId(user.getId());
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            for(SysPermission permission:permissions){
                if(permission != null && StringUtils.isNotEmpty(permission.getName())){

                }
            }
        }
        return null;
    }
}
