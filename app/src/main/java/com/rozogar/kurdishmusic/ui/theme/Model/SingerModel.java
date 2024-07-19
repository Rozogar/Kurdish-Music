package com.rozogar.kurdishmusic.ui.theme.Model;

import androidx.annotation.NonNull;

public class SingerModel {
    private int singersImage;
    private String singersName;

    public SingerModel(int singersImage, String singersName) {
        this.singersImage = singersImage;
        this.singersName = singersName;
    }

    public SingerModel() {
    }

    public int getSingersImage() {
        return singersImage;
    }

    public void setSingersImage(int singersImage) {
        this.singersImage = singersImage;
    }

    public String getSingersName() {
        return singersName;
    }

    public void setSingersName(String singersName) {
        this.singersName = singersName;
    }

    @NonNull
    @Override
    public String toString() {
        return singersName;
    }
}

