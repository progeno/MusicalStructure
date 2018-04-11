package com.example.android.v3musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<String> {
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String currentArtist = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.artist_item, parent, false);
        }

        TextView tvArtistName = (TextView) listItemView.findViewById(R.id.tv_artist_name);
        tvArtistName.setText(currentArtist);

        return listItemView;
    }

    public ArtistAdapter(Activity context, ArrayList<String> artists) {
        super(context, 0, artists);
    }
}