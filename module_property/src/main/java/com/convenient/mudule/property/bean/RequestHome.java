package com.convenient.mudule.property.bean;


import com.convenient.qd.core.base.AppInfo;

/**
 * @author nicai
 * @date: 2019-9-23
 * desc:
 */

public class RequestHome extends RequestBase{
    private int page;
    private int size;

    private AppInfo appInfo;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public AppInfo getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(AppInfo appInfo) {
        this.appInfo = appInfo;
    }
}
