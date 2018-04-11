package com.example.android.v3musicalstructure;

public class Song {

    private String songTitle;
    private String artistName;
    /*    private String albumTitle;*/
    private String songLength;

    public Song(String title, String artist, String album, String length/*, String style*/) {
        this.songTitle = title;
        this.artistName = artist;
        /*       this.albumTitle = album;*/
        this.songLength = length;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongLength() {
        return songLength;
    }

}