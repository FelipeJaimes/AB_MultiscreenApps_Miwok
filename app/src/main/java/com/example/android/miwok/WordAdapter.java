package com.example.android.miwok;

import android.app.Activity;
import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        //Checking id the instance have the image parameter
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_imageView);
        if (currentWord.getImageResourceId() != null) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

//      BETTER AND WITH CLEANER CODE THIS WAY:
//        if(currentWord.getImageResourceId() != null ){
//            ImageView imageView =(ImageView) listItemView.findViewById(R.id.image_imageView);
//            imageView.setImageResource(currentWord.getImageResourceId());
//        }

        //set default translation
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_textView);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        //set miwok translation
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_textView);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //TextContainer and iconImageView associated activity color
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        View textContainer = listItemView.findViewById(R.id.text_container);
        textContainer.setBackgroundColor(color);

        ImageView iconImageView =(ImageView) listItemView.findViewById(R.id.icon_imageView);
        iconImageView.setBackgroundColor(color);

        return listItemView;
    }
}
