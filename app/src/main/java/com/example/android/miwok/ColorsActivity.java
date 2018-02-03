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
        words.add(new Word(getResources().getString(R.string.string_red), "weṭeṭṭi"));
        words.add(new Word(getResources().getString(R.string.string_green), "chokokki"));
        words.add(new Word(getResources().getString(R.string.string_brown), "ṭakaakki"));
        words.add(new Word(getResources().getString(R.string.string_gray), "ṭopoppi"));
        words.add(new Word(getResources().getString(R.string.string_black), "kululli"));
        words.add(new Word(getResources().getString(R.string.string_white), "kelelli"));
        words.add(new Word(getResources().getString(R.string.string_dusty_yellow), "ṭopiisә"));
        words.add(new Word(getResources().getString(R.string.string_mustard_yellow), "chiwiiṭә"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
