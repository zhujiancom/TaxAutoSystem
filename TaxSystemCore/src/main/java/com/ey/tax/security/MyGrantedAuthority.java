package com.ey.tax.security;

import com.ey.tax.entity.SysPermission;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

/**
 * Created by zhuji on 3/26/2018.
 */
public class MyGrantedAuthority implements GrantedAuthority{
    private final String role;

    private List<SysPermission> permissions;

    public MyGrantedAuthority(String role) {
        this.role = role;
    }

    public List<SysPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysPermission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String getAuthority() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        MyGrantedAuthority that = (MyGrantedAuthority) o;

        return new EqualsBuilder()
                .append(role, that.role)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(role)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "MyGrantedAuthority{" +
                "role='" + role + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
