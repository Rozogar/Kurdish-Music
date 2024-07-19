package com.rozogar.kurdishmusic.ui.theme.Model;

import java.io.Serializable;


public class MusicModel implements Serializable {
    private final int img;
    private int song;
    private final String name;

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


    public int getSong() {
        return song;
    }


    public String getName() {
        return name;
    }



    public String toString() {
        return name;
    }
}

