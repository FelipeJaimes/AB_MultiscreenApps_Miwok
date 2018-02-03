package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList();
        words.add(new Word(getResources().getString(R.string.string_father), "әpә"));
        words.add(new Word(getResources().getString(R.string.string_mother), "әṭa"));
        words.add(new Word(getResources().getString(R.string.string_son), "angsi"));
        words.add(new Word(getResources().getString(R.string.string_daughter), "tune"));
        words.add(new Word(getResources().getString(R.string.string_older_brother), "taachi"));
        words.add(new Word(getResources().getString(R.string.string_younger_brother), "chalitti"));
        words.add(new Word(getResources().getString(R.string.string_older_sister), "teṭe"));
        words.add(new Word(getResources().getString(R.string.string_younger_sister), "kolliti"));
        words.add(new Word(getResources().getString(R.string.string_grandmother), "ama"));
        words.add(new Word(getResources().getString(R.string.string_grandfather), "paapa"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
