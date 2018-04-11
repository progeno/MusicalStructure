package com.example.android.v3musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        ArrayList<Song> alSongs = new ArrayList<Song>();
        alSongs.add(new Song("A Day Without Rain", "Enya", "A Day Without Rain", "2:38"));
        alSongs.add(new Song("Wild Child", "Enya", "A Day Without Rain", "3:47"));
        alSongs.add(new Song("Only Time", "Enya", "A Day Without Rain", "3:38"));
        alSongs.add(new Song("Tempus Vernum", "Enya", "A Day Without Rain", "2:24"));
        alSongs.add(new Song("Deora Ar Mo Chroí (Tears on my Heart)", "Enya", "A Day Without Rain", "2:48"));
        alSongs.add(new Song("Flora's Secret", "Enya", "A Day Without Rain", "4:07"));
        alSongs.add(new Song("Fallen Embers", "Enya", "A Day Without Rain", "2:31"));
        alSongs.add(new Song("Silver Inches", "Enya", "A Day Without Rain", "1:37"));
        alSongs.add(new Song("Pilgrim", "Enya", "A Day Without Rain", "3:12"));
        alSongs.add(new Song("One by One", "Enya", "A Day Without Rain", "3:56"));
        alSongs.add(new Song("The First of Autumn", "Enya", "A Day Without Rain", "3:10"));
        alSongs.add(new Song("Lazy Days", "Enya", "A Day Without Rain", "3:42"));
        alSongs.add(new Song("Watermark", "Enya", "Watermark", "2:24"));
        alSongs.add(new Song("Cursum Perficio", "Enya", "Watermark", "4:06"));
        alSongs.add(new Song("Storms in Africa", "Enya", "Watermark", "4:03"));
        alSongs.add(new Song("Orinoco Flow", "Enya", "Watermark", "4:25"));
        alSongs.add(new Song("Now", "Carpenters", "Voice Of The Heart", "3:51"));
        alSongs.add(new Song("Two Lives", "Carpenters", "Voice Of The Heart", "4:35"));
        alSongs.add(new Song("You're Enough", "Carpenters", "Voice Of The Heart", "3:48"));
        alSongs.add(new Song("Now", "Kari Bremnes", "Og så kom resten av livet", "4:51"));
        alSongs.add(new Song("Tubular Bells, Part One", "Mike Oldfield", "Tubular Bells", "25:30"));
        alSongs.add(new Song("Tubular Bells, Part Two", "Mike Oldfield", "Tubular Bells", "23:20"));

        //Create an array of unique artists
        ArrayList<String> alArtists = new ArrayList<String>();
        for (Song s : alSongs) {
            if (!alArtists.contains(s.getArtistName())) {
                alArtists.add(s.getArtistName());
            }
        }
        for (int i = 0; i < alArtists.size(); i++) {
            Log.i("SongsActivity", "artists[" + i + "]=" + alArtists.get(i));
        }

        ArtistAdapter adapter = new ArtistAdapter(this, /*MainActivity.*/alArtists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

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