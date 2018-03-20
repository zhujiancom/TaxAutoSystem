package com.ey.tax.configuration.security;

import com.ey.tax.core.dao.PermissionDAO;
import com.ey.tax.core.repository.SysUserRepository;
import com.ey.tax.entity.SysPermission;
import com.ey.tax.entity.SysUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

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
            List<GrantedAuthority> grantedAuthorities = permissions.stream()
                    .filter(permission -> permission != null && StringUtils.isNotEmpty(permission.getName()))
                    .map(permission -> new SimpleGrantedAuthority(permission.getName())) //将权限信息添加到GrantedAuthority对象中，在后面进行权限验证是会使用到grantedAuthority对象
                    .collect(Collectors.toList());
            return new User(user.getUserName(),user.getPassword(),grantedAuthorities);
        }else{
            throw new UsernameNotFoundException("User: " + username + " do not exist!");
        }
    }
}
