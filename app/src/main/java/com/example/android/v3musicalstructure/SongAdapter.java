package com.example.android.v3musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Song currentSong = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_item, parent, false);
        }
        TextView tvSongTitle = (TextView) listItemView.findViewById(R.id.tv_song_title);
        tvSongTitle.setText(currentSong.getSongTitle());

        TextView tvArtistName = (TextView) listItemView.findViewById(R.id.tv_artist_name);
        tvArtistName.setText(currentSong.getArtistName());

        TextView tvSongLength = (TextView) listItemView.findViewById(R.id.tv_song_length);
        tvSongLength.setText(currentSong.getSongLength());

        return listItemView;
    }

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }
}
