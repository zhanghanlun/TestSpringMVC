package com.zhanghanlun.entity;

/**
 * @Description
 * @Author zhanghanlun
 * @Create 2018-08-14 9:40
 **/
public class Status {
    private String token;
    private String userId;
    private String userCode;
    private String username;
    private String proEndDate;
    private String subscribeType;
    private Boolean needSubscribe;
    private String inboxId;
    private Boolean pro;
    private Boolean ds;
    private String subscribeFreq;

    public Status() {
        token = null;
        userId = "1011436981";
        userCode = null;
        username = "zhanghanlun1@foxmail.com";
        proEndDate = "2020-01-01T00:00:00.000+0000";
        subscribeType = "order";
        subscribeFreq = null;
        needSubscribe = false;
        inboxId = "inbox1011436981";
        pro = true;
        ds = true;
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

    public String getSubscribeType() {
        return subscribeType;
    }

    public void setSubscribeType(String subscribeType) {
        this.subscribeType = subscribeType;
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

    public Boolean getPro() {
        return pro;
    }

    public void setPro(Boolean pro) {
        this.pro = pro;
    }

    public Boolean getDs() {
        return ds;
    }

    public void setDs(Boolean ds) {
        this.ds = ds;
    }

    public String getSubscribeFreq() {
        return subscribeFreq;
    }

    public void setSubscribeFreq(String subscribeFreq) {
        this.subscribeFreq = subscribeFreq;
    }
}
