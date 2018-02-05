package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList();
        words.add(new Word(getResources().getString(R.string.string_red), "weṭeṭṭi", R.drawable.color_red));
        words.add(new Word(getResources().getString(R.string.string_green), "chokokki", R.drawable.color_green));
        words.add(new Word(getResources().getString(R.string.string_brown), "ṭakaakki", R.drawable.color_brown));
        words.add(new Word(getResources().getString(R.string.string_gray), "ṭopoppi", R.drawable.color_gray));
        words.add(new Word(getResources().getString(R.string.string_black), "kululli", R.drawable.color_black));
        words.add(new Word(getResources().getString(R.string.string_white), "kelelli", R.drawable.color_white));
        words.add(new Word(getResources().getString(R.string.string_dusty_yellow), "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new Word(getResources().getString(R.string.string_mustard_yellow), "chiwiiṭә", R.drawable.color_mustard_yellow));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
