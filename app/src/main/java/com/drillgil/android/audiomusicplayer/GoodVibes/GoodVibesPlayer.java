package com.drillgil.android.audiomusicplayer.GoodVibes;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.drillgil.android.audiomusicplayer.R;

import java.util.ArrayList;

public class GoodVibesPlayer extends AppCompatActivity {

    private ArrayList<GoodVibes> goodVibesList;
    private GoodVibesAdapter adapter;
    private ListView songList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_vibes_player);

        songList = (ListView)findViewById(R.id.good_vibes_list_view);

        // Create a list of songs
        goodVibesList = new ArrayList<>();
        goodVibesList.add(new GoodVibes("The Glory", "good vibes with some glory",R.raw.glory));
        goodVibesList.add(new GoodVibes("Some Headway ", "made for  people who fills the headway ",R.raw.headway));
        goodVibesList.add(new GoodVibes("Heroic Theme", "good vibes with heroic fillings",R.raw.heroic));
        goodVibesList.add(new GoodVibes("Inspiring Cinematic", "inspiring Cinematic with some good vibes in it",R.raw.inspiring));
        goodVibesList.add(new GoodVibes("Spirit", "the spirit that fills you with good vibes",R.raw.spirit));

        // Create an {@link GoodVibesAdapter}, whose data source is a list of {@link GoodVibes}s. The
        // adapter knows how to create list items for each item in the list.
        adapter = new GoodVibesAdapter(this, R.layout.list_item, goodVibesList);

        // Make the {@link ListView} use the {@link GoodVibesAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link GoodVibes} in the list.
        songList.setAdapter(adapter);
    }
}