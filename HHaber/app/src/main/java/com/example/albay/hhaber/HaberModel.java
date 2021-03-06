package com.example.albay.hhaber;

import java.util.ArrayList;

/**
 * Created by Hakan Albay on 28.04.2018.
 */

public class HaberModel {
    private String Description,Title,Url;
    private ArrayList<HaberGorsel> Files;
    public HaberModel(String description, String title, String url, ArrayList<HaberGorsel> files){
        Description =description;
        Title=title;
        Url=url;
        Files=files;
    }
    public String getDescription(){ return Description;}
    public void setDescription(String description){Description=description;}

    public String getTitle(){return Title;}

    public void setTitle(String title) {
        Title = title;
    }

    public String getUrl(){return Url;}
    public void setUrl(String url){Url=url;}

    public ArrayList<HaberGorsel> getFiles() {return Files;}

    public void setFiles(ArrayList<HaberGorsel> files) {
        Files = files;
    }
}
