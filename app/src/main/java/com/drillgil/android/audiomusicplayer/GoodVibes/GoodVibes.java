package com.drillgil.android.audiomusicplayer.GoodVibes;

public class GoodVibes {

    private String Name;
    private String About;
    private int Song;

    /**
     *
     * @param name the name of the track
     * @param about some info about the track
     * @param song the tack
     */
    public GoodVibes(String name, String about, int song) {
        Name = name;
        About = about;
        Song = song;
    }

    /**
     *
     * @return Name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     *
     * @return About
     */
    public String getAbout() {
        return About;
    }

    /**
     *
     * @param about
     */
    public void setAbout(String about) {
        this.About = about;
    }

    /**
     *
     * @return Song
     */
    public int getSong() {
        return Song;
    }

    /**
     *
     * @param song
     */
    public void setSong(int song) {
        Song = song;
    }
}
