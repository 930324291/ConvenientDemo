package com.convenient.mudule.property.bean;

import java.util.List;

/**
 * @author nicai
 * @date: 2019-9-23
 * desc:
 */

public class HomeResponse {
    private String success;
    private List<PageMainData> data;
    private String message;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public List<PageMainData> getData() {
        return data;
    }

    public void setData(List<PageMainData> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
