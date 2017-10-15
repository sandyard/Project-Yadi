package com.example.edsnowden.guidemanasikumrah;

/**
 * Created by Asus on 15/10/2017.
 */

public class Word {
    private String mDoaManasik;

    private String mDoaManasik2;

    private int mAudioId;



    public Word(String doaManasik2, String doaManasik, int audioId){
        mDoaManasik2 = doaManasik2;
        mDoaManasik = doaManasik;
        mAudioId = audioId;
    }

    public String getmDoaManasik2(){
        return mDoaManasik2;
    }

    public String getmDoaManasik(){
        return mDoaManasik;
    }

    public int getmAudioId(){
        return mAudioId;
    }
}

