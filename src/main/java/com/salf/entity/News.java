package com.salf.entity;

import java.io.Serializable;
import java.util.Date;


public class News implements Serializable {
    private int id;
    private String main;
    private String title;
    private String img_src;
    private String date;

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", main='" + main + '\'' +
                ", title='" + title + '\'' +
                ", img_src='" + img_src + '\'' +
                ", date=" + date +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
