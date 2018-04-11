package com.example.android.v3musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        final Activity currentActivity = this;

        TextView btBack = (TextView) findViewById(R.id.bt_back);
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntend = new Intent(currentActivity, MainActivity.class);
                startActivity(mainIntend);
            }
        });

        Button btSongs = (Button) findViewById(R.id.bt_songs);
        btSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntend = new Intent(currentActivity, SongsActivity.class);
                startActivity(songsIntend);
            }
        });

        Button btArtists = (Button) findViewById(R.id.bt_artists);
        btArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntend = new Intent(currentActivity, ArtistsActivity.class);
                startActivity(artistsIntend);
            }
        });

        Button btNowPlaying = (Button) findViewById(R.id.bt_nowPlaying);
        btNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntend = new Intent(currentActivity, NowPlayingActivity.class);
                startActivity(nowPlayingIntend);
            }
        });
    }
}