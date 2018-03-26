package com.ey.tax.configuration.security;

import com.ey.tax.core.dao.PermissionDAO;
import com.ey.tax.core.dao.PrivilegeDAO;
import com.ey.tax.core.repository.SysUserRepository;
import com.ey.tax.entity.SysPermission;
import com.ey.tax.entity.SysRole;
import com.ey.tax.entity.SysUser;
import com.ey.tax.security.MyGrantedAuthority;
import com.ey.tax.security.SecurityUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
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

    @Autowired
    private PrivilegeDAO privilegeDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = sysUserRepository.findByUserName(username);
        if(user != null){
            List<SysRole> roles = privilegeDAO.findRolesByUser(user.getId());
            List<GrantedAuthority> grantedAuthorities = roles.stream()
                    .filter(role -> role != null && StringUtils.isNotEmpty(role.getRoleName()))
                    .map(role -> {
                        MyGrantedAuthority grantedAuthority = new MyGrantedAuthority(role.getRoleName());
                        List<SysPermission> permissions = privilegeDAO.findPermissionsByRole(role.getId());
                        grantedAuthority.setPermissions(permissions);
                        return grantedAuthority;
                    }) //将角色信息添加到GrantedAuthority对象中，在后面进行权限验证是会使用到grantedAuthority对象
                    .collect(Collectors.toList());
            return new SecurityUser(user.getId(),user.getUserName(),user.getPassword(),grantedAuthorities);
        }else{
            throw new UsernameNotFoundException("User: " + username + " do not exist!");
        }
    }
}
