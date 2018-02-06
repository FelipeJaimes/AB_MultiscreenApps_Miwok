package com.example.android.miwok;

import android.media.Image;

/**
 * Created by Felipe on 2/2/2018.
 */

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private Integer mImageResourceId;
    private Integer mSoundResourceId;

    public Word(String defaultTranslation, String miwokTranslation, Integer imageResourceId, Integer soundResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, Integer soundResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mSoundResourceId = soundResourceId;
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

    public Integer getSoundResourceId(){
        return mSoundResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mSoundResourceId=" + mSoundResourceId +
                '}';
    }
}

