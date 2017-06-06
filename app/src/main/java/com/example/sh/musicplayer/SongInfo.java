package com.example.sh.musicplayer;

/**
 * Created by Shabbir Hussain on 6/6/2017.
 */
public class SongInfo {
    public  String Path;
    public  String song_name;
    public  String album_name;
    public  String artist_name;
    public  SongInfo(String Path,String song_name,String album_name,
                     String artist_name){
        this.Path=Path;
        this.song_name=song_name;
        this.album_name=album_name;
        this.artist_name=artist_name;
    }

    public String getPath() {
        return Path;
    }

    public String getSong_name() {
        return song_name;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public String getArtist_name() {
        return artist_name;
    }
}