package com.ey.tax.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zhuji on 2/8/2018.
 */
@Entity
@Table(name="T_LOGIN_ACCOUNT_LOG")
public class AccountLoginLogEntity extends BaseEntity{
    @Column(name="ONLINE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date onlineTime;

    @Column(name="OFFLINE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date offlineTime;

    @Column(name="STAY_TIME")
    private BigDecimal stayTime;

    @Column(name="LOGIN_IP")
    private String loginIp;

    @Column(name="SYS_USER_ID")
    private Long userId;

    public Date getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    public BigDecimal getStayTime() {
        return stayTime;
    }

    public void setStayTime(BigDecimal stayTime) {
        this.stayTime = stayTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
