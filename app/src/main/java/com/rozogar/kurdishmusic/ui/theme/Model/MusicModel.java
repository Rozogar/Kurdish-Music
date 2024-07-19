package com.rozogar.kurdishmusic.ui.theme.Model;

import java.io.Serializable;

import androidx.annotation.NonNull;

public class MusicModel implements Serializable {
    private int img;
    private int song;
    private String name;

    public MusicModel(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public MusicModel(int img, String name, int song) {
        this.img = img;
        this.name = name;
        this.song = song;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MusicModel() {
    }

    @Override
    public String toString() {
        return "MusicModel{" +
                "img=" + img +
                ", song=" + song +
                ", name='" + name + '\'' +
                '}';
    }
}

