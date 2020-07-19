package com.macro.mall.portal.domain;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="launch_info")
public class LaunchConfigInfo {

    private boolean open;//是否打开广告
    private int duration; //显示持续时间,单位s
    private String adUrl; // 广告图片
    private String clickUrl; // 广告点击显示url

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    public String getClickUrl() {
        return clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;
    }

}
