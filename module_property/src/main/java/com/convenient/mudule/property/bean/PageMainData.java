package com.convenient.mudule.property.bean;

import java.util.ArrayList;

/**
 * @author nicai
 * @date: 2019-9-23
 * desc:
 */

public class PageMainData {
    private String name;
    private String icon;
    private int weight;
    private String type;
    private ArrayList<PageClassData> data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<PageClassData> getData() {
        return data;
    }

    public void setData(ArrayList<PageClassData> data) {
        this.data = data;
    }
}
