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
        words.add(new Word(getResources().getString(R.string.string_father), "әpә", R.drawable.family_father));
        words.add(new Word(getResources().getString(R.string.string_mother), "әṭa", R.drawable.family_mother));
        words.add(new Word(getResources().getString(R.string.string_son), "angsi", R.drawable.family_son));
        words.add(new Word(getResources().getString(R.string.string_daughter), "tune", R.drawable.family_daughter));
        words.add(new Word(getResources().getString(R.string.string_older_brother), "taachi", R.drawable.family_older_brother));
        words.add(new Word(getResources().getString(R.string.string_younger_brother), "chalitti", R.drawable.family_younger_brother));
        words.add(new Word(getResources().getString(R.string.string_older_sister), "teṭe", R.drawable.family_older_sister));
        words.add(new Word(getResources().getString(R.string.string_younger_sister), "kolliti", R.drawable.family_younger_sister));
        words.add(new Word(getResources().getString(R.string.string_grandmother), "ama", R.drawable.family_grandmother));
        words.add(new Word(getResources().getString(R.string.string_grandfather), "paapa", R.drawable.family_grandfather));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
