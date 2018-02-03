package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList();
        words.add(new Word(getResources().getString(R.string.string_where_are_you_going), "minto wuksus	"));
        words.add(new Word(getResources().getString(R.string.string_what_is_your_name), "tinnә oyaase'nә"));
        words.add(new Word(getResources().getString(R.string.string_my_name_is), "oyaaset..."));
        words.add(new Word(getResources().getString(R.string.string_how_are_you_feeling), "michәksәs?"));
        words.add(new Word(getResources().getString(R.string.string_im_feeling_good), "kuchi achit"));
        words.add(new Word(getResources().getString(R.string.string_are_you_coming), "әәnәs'aa?"));
        words.add(new Word(getResources().getString(R.string.string_yes_im_coming), "hәә’ әәnәm"));
        words.add(new Word(getResources().getString(R.string.string_im_coming), "әәnәm"));
        words.add(new Word(getResources().getString(R.string.string_lets_go), "yoowutis"));
        words.add(new Word(getResources().getString(R.string.string_come_here), "әnni'nem"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
