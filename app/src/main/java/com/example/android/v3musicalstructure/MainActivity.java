package com.example.android.v3musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView tvSongs = (TextView) findViewById(R.id.tv_songs);
        tvSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntend = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntend);
            }
        });

        TextView tvArtists = (TextView) findViewById(R.id.tv_artists);
        tvArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntend = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntend);
            }
        });

        TextView tvNowPlaying = (TextView) findViewById(R.id.tv_now_playing);
        tvNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntend = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntend);
            }
        });
    }
}
