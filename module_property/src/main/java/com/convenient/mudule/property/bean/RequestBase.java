package com.convenient.mudule.property.bean;

/**
 * @author nicai
 * @date: 2019-9-23
 * desc:
 */

public class RequestBase {
    private String accessToken;
    private String appId;
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}

