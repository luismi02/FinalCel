package com.example.dell.finalcel;

import android.view.View;

import java.io.Serializable;

public class ConfigYoutube implements Serializable {


   String DEVELOPER_KEY = "AIzaSyDve_BueywnSBNmk5XXopsiHGusiSebsWE";
   String YOUTUBE_VIDEO_CODE;


    public ConfigYoutube() {
    }

    public ConfigYoutube(String DEVELOPER_KEY, String YOUTUBE_VIDEO_CODE) {
        this.DEVELOPER_KEY = DEVELOPER_KEY;
        this.YOUTUBE_VIDEO_CODE = YOUTUBE_VIDEO_CODE;
    }

    public String getDEVELOPER_KEY() {
        return DEVELOPER_KEY;
    }

    public void setDEVELOPER_KEY(String DEVELOPER_KEY) {
        this.DEVELOPER_KEY = DEVELOPER_KEY;
    }

    public String getYOUTUBE_VIDEO_CODE() {
        return YOUTUBE_VIDEO_CODE;
    }

    public void setYOUTUBE_VIDEO_CODE(String YOUTUBE_VIDEO_CODE) {
        this.YOUTUBE_VIDEO_CODE = YOUTUBE_VIDEO_CODE;
    }
}
