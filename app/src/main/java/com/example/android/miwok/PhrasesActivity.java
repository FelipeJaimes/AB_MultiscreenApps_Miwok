package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    private AudioManager mAudioManager;

    AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AudioManager.AUDIOFOCUS_GAIN_TRANSIENT || focusChange == AudioManager.AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK) {
                mMediaPlayer.pause();
                mMediaPlayer.seekTo(0);
            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                mMediaPlayer.start();
            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                releaseMediaPlayer();
            }
        }
    };

    private MediaPlayer.OnCompletionListener mOnCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        final ArrayList<Word> words = new ArrayList();
        words.add(new Word(getResources().getString(R.string.string_where_are_you_going), "minto wuksus	", R.raw.phrase_where_are_you_going));
        words.add(new Word(getResources().getString(R.string.string_what_is_your_name), "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        words.add(new Word(getResources().getString(R.string.string_my_name_is), "oyaaset...", R.raw.phrase_my_name_is));
        words.add(new Word(getResources().getString(R.string.string_how_are_you_feeling), "michәksәs?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word(getResources().getString(R.string.string_im_feeling_good), "kuchi achit", R.raw.phrase_im_feeling_good));
        words.add(new Word(getResources().getString(R.string.string_are_you_coming), "әәnәs'aa?", R.raw.phrase_are_you_coming));
        words.add(new Word(getResources().getString(R.string.string_yes_im_coming), "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        words.add(new Word(getResources().getString(R.string.string_im_coming), "әәnәm", R.raw.phrase_im_coming));
        words.add(new Word(getResources().getString(R.string.string_lets_go), "yoowutis", R.raw.phrase_lets_go));
        words.add(new Word(getResources().getString(R.string.string_come_here), "әnni'nem", R.raw.phrase_come_here));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);
                releaseMediaPlayer();
                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getSoundResourceId());
                    mMediaPlayer.start();
                    mMediaPlayer.setOnCompletionListener(mOnCompletionListener);
                }
            }
        });

    }

    //Clean up the media player by releasing its resources.
    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

}
