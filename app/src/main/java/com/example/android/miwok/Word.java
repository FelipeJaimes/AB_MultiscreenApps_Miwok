package com.example.android.miwok;

import android.media.Image;

/**
 * Created by Felipe on 2/2/2018.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private Integer mImageResourceId;

    public Word(String defaultTranslation, String miwokTranslation, Integer imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public Integer getImageResourceId(){
        return mImageResourceId;
    }

}

