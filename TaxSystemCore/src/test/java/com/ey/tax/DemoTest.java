package com.ey.tax;

import com.ey.tax.entity.SysPermission;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhuji on 3/20/2018.
 */
public class DemoTest {
    @Test
    public void testJava8Stream(){
        List<SysPermission> permissions = new ArrayList<>();
        SysPermission sp1 = new SysPermission();
        sp1.setName("sp1");
        SysPermission sp2 = new SysPermission();
        permissions.add(sp1);
        permissions.add(sp2);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        List<GrantedAuthority> grantedAuthorities2 = new ArrayList<>();
        for(SysPermission permission:permissions){
            if(permission != null && StringUtils.isNotEmpty(permission.getName())){
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getName());
                //将权限信息添加到GrantedAuthority对象中，在后面进行权限验证是会使用到grantedAuthroity对象
                grantedAuthorities2.add(grantedAuthority);
            }
        }

        grantedAuthorities = permissions.stream()
                .filter(permission -> permission != null && StringUtils.isNotEmpty(permission.getName()))
                .map(permission -> new SimpleGrantedAuthority(permission.getName()))
                .collect(Collectors.toList());

        System.out.println("java7 size: "+grantedAuthorities2.size());
        System.out.println("java8 size: "+grantedAuthorities.size());
    }
}
