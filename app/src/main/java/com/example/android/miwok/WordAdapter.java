package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        Word currentWord = getItem(position);

        if(currentWord.getImageResourceId() != null ){
            ImageView imageView =(ImageView) listItemView.findViewById(R.id.image_imageView);
            imageView.setImageResource(currentWord.getImageResourceId());

        }

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_textView);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_textView);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        return listItemView;
    }
}
