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
        words.add(new Word(getResources().getString(R.string.one), "lutti", R.drawable.number_one));
        words.add(new Word(getResources().getString(R.string.two), "otiiko", R.drawable.number_two));
        words.add(new Word(getResources().getString(R.string.three), "tolookosu", R.drawable.number_three));
        words.add(new Word(getResources().getString(R.string.four), "oyyisa", R.drawable.number_four));
        words.add(new Word(getResources().getString(R.string.five), "massokka", R.drawable.number_five));
        words.add(new Word(getResources().getString(R.string.six), "temmokka", R.drawable.number_six));
        words.add(new Word(getResources().getString(R.string.seven), "kenekaku", R.drawable.number_seven));
        words.add(new Word(getResources().getString(R.string.eight), "kawinta", R.drawable.number_eight));
        words.add(new Word(getResources().getString(R.string.nine), "wo’e", R.drawable.number_nine));
        words.add(new Word(getResources().getString(R.string.ten), "na’aacha", R.drawable.number_ten));

        WordAdapter adapter= new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
