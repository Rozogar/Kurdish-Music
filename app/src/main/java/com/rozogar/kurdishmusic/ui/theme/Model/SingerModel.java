package com.rozogar.kurdishmusic.ui.theme.Model;



public class SingerModel {
    private final int singersImage;
    private final String singersName;

    public SingerModel(int singersImage, String singersName) {
        this.singersImage = singersImage;
        this.singersName = singersName;
    }

    public int getSingersImage() {
        return singersImage;
    }
    public String getSingersName() {
        return singersName;
    }
    @Override
    public String toString() {
        return singersName;
    }
}

