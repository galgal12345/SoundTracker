package com.drillgil.android.audiomusicplayer.Meditate;

public class Meditate {
    private String Name;
    private String Singer;
    private int Song;

    public Meditate(String name, String singer, int song) {
        Name = name;
        Singer = singer;
        Song = song;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public int getSong() {
        return Song;
    }

    public void setSong(int song) {
        Song = song;
    }
}
