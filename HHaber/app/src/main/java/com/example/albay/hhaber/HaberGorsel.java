package com.example.albay.hhaber;

/**
 * Created by Hakan Albay on 28.04.2018.
 */

public class HaberGorsel {
    private String FileUrl;

    public HaberGorsel(String fileUrl){
        FileUrl=fileUrl;
    }

    public String getFileUrl() {
        return FileUrl;
    }

    public void setFileUrl(String fileUrl){
        FileUrl=fileUrl;
    }
}
