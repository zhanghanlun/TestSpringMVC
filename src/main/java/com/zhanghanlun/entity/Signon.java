package com.zhanghanlun.entity;

/**
 * @Description
 * @Author zhanghanlun
 * @Create 2018-08-14 9:39
 **/
public class Signon {
    private String token;
    private String userId;
    private String userCode;
    private String username;
    private String proEndDate;
    private String subscribeFreq;
    private Boolean needSubscribe;
    private String inboxId;
    private Boolean ds;
    private Boolean pro;
    private String subscribeType;

    public Signon() {
        token = "***";
        userId = "***";
        userCode = null;
        username = "***";
        proEndDate = "2020-01-01T00:00:00.000+0000";
        subscribeType = "order";
        subscribeFreq = null;
        needSubscribe = false;
        inboxId = "inbox1011436981";
        ds = true;
        pro = true;
    }

    public String getSubscribeType() {
        return subscribeType;
    }

    public void setSubscribeType(String subscribeType) {
        this.subscribeType = subscribeType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProEndDate() {
        return proEndDate;
    }

    public void setProEndDate(String proEndDate) {
        this.proEndDate = proEndDate;
    }

    public String getSubscribeFreq() {
        return subscribeFreq;
    }

    public void setSubscribeFreq(String subscribeFreq) {
        this.subscribeFreq = subscribeFreq;
    }

    public Boolean getNeedSubscribe() {
        return needSubscribe;
    }

    public void setNeedSubscribe(Boolean needSubscribe) {
        this.needSubscribe = needSubscribe;
    }

    public String getInboxId() {
        return inboxId;
    }

    public void setInboxId(String inboxId) {
        this.inboxId = inboxId;
    }

    public Boolean getDs() {
        return ds;
    }

    public void setDs(Boolean ds) {
        this.ds = ds;
    }

    public Boolean getPro() {
        return pro;
    }

    public void setPro(Boolean pro) {
        this.pro = pro;
    }
}
