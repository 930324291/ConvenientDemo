package com.convenient.mudule.property.bean;

import android.text.TextUtils;

import java.util.List;

/**
 * @author nicai
 * @date: 2019-9-23
 * desc:
 */

public class PageClassData {
    //图标
    private String delete;
    private String app;
    private String owner;
    private String creator;
    private String created;
    private String modifier;
    private String modified;
    private String stime;
    private String id;
    private String appName;
    private String appId;
    private String appIconUrl;
    private String appStartUrl;
    private String appType;
    private String appIsPrevent;
    private String appLevel;
    private String appMerchantId;
    private int appRedDot;
    private int navType;
    private String teamId;
    private int defaultIndex;
    private String type;
    private String teamName;
    private String teamOrder;
    private int sortValue;
    private int login=1;
    private String iosGopage;
    private String androidGopage;
    private int impower;

    //今日热点
    private int total;
    private int page;
    private int size;
    private int totalPages;
    private List<HotsInfo> data; // 图标

    //今日热点
    private String  name;
    private String desc;
    private String price;
    private String button;
    private String imgurl;

    //轮播图
    private String image;
    private String ios;
    private String android;

    private int addToorbar;
    private String threeappId;

    public PageClassData(String appName, String type,String appId,String appIconUrl, String appStartUrl, String appType, int login, String androidGopage, int impower, int addToorbar, String threeappId) {
        this.appName = appName;
        this.type = type;
        this.appId = appId;
        this.appIconUrl = appIconUrl;
        this.appStartUrl = appStartUrl;
        this.appType = appType;
        this.login = login;
        this.androidGopage = androidGopage;
        this.impower = impower;
        this.addToorbar = addToorbar;
        this.threeappId = threeappId;
    }

    public String getName() {
        if(TextUtils.isEmpty(name)){
            name = "";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getDelete() {
        if(TextUtils.isEmpty(delete)){
            delete = "";
        }
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppIconUrl() {
        return appIconUrl;
    }

    public void setAppIconUrl(String appIconUrl) {
        this.appIconUrl = appIconUrl;
    }

    public String getAppStartUrl() {
        return appStartUrl;
    }

    public void setAppStartUrl(String appStartUrl) {
        this.appStartUrl = appStartUrl;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppIsPrevent() {
        return appIsPrevent;
    }

    public void setAppIsPrevent(String appIsPrevent) {
        this.appIsPrevent = appIsPrevent;
    }

    public String getAppLevel() {
        return appLevel;
    }

    public void setAppLevel(String appLevel) {
        this.appLevel = appLevel;
    }

    public String getAppMerchantId() {
        return appMerchantId;
    }

    public void setAppMerchantId(String appMerchantId) {
        this.appMerchantId = appMerchantId;
    }

    public int getAppRedDot() {
        return appRedDot;
    }

    public void setAppRedDot(int appRedDot) {
        this.appRedDot = appRedDot;
    }

    public int getNavType() {
        return navType;
    }

    public void setNavType(int navType) {
        this.navType = navType;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public int getDefaultIndex() {
        return defaultIndex;
    }

    public void setDefaultIndex(int defaultIndex) {
        this.defaultIndex = defaultIndex;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamOrder() {
        return teamOrder;
    }

    public void setTeamOrder(String teamOrder) {
        this.teamOrder = teamOrder;
    }

    public int getSortValue() {
        return sortValue;
    }

    public void setSortValue(int sortValue) {
        this.sortValue = sortValue;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

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

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<HotsInfo> getData() {
        return data;
    }

    public void setData(List<HotsInfo> data) {
        this.data = data;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIos() {
        return ios;
    }

    public void setIos(String ios) {
        this.ios = ios;
    }

    public String getAndroid() {
        return android;
    }

    public void setAndroid(String android) {
        this.android = android;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAndroidGopage() {
        return androidGopage;
    }

    public void setAndroidGopage(String androidGopage) {
        this.androidGopage = androidGopage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public String getIosGopage() {
        return iosGopage;
    }

    public void setIosGopage(String iosGopage) {
        this.iosGopage = iosGopage;
    }

    public int getImpower() {
        return impower;
    }

    public void setImpower(int impower) {
        this.impower = impower;
    }

    public int getAddToorbar() {
        return addToorbar;
    }

    public void setAddToorbar(int addToorbar) {
        this.addToorbar = addToorbar;
    }

    public String getThreeappId() {
        return threeappId;
    }

    public void setThreeappId(String threeappId) {
        this.threeappId = threeappId;
    }
}
