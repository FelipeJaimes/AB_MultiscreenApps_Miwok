package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList();
        words.add(new Word(getResources().getString(R.string.one), "lutti"));
        words.add(new Word(getResources().getString(R.string.two), "otiiko"));
        words.add(new Word(getResources().getString(R.string.three), "tolookosu"));
        words.add(new Word(getResources().getString(R.string.four), "oyyisa"));
        words.add(new Word(getResources().getString(R.string.five), "massokka"));
        words.add(new Word(getResources().getString(R.string.six), "temmokka"));
        words.add(new Word(getResources().getString(R.string.seven), "kenekaku"));
        words.add(new Word(getResources().getString(R.string.eight), "kawinta"));
        words.add(new Word(getResources().getString(R.string.nine), "wo’e"));
        words.add(new Word(getResources().getString(R.string.ten), "na’aacha"));

        WordAdapter adapter= new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
