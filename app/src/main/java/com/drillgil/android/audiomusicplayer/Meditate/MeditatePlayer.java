package com.drillgil.android.audiomusicplayer.Meditate;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.drillgil.android.audiomusicplayer.R;

import java.util.ArrayList;

public class MeditatePlayer extends AppCompatActivity {
    
    private ArrayList<Meditate> meditateList;
    private MeditateAdapter adapter;
    private ListView songList;

    private static final String TAG = "MeditateActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditate_player);

        songList = (ListView)findViewById(R.id.meditate_list_view);
        meditateList = new ArrayList<>();
        meditateList.add(new Meditate("The Beginning", "made for morning inspiring driving",R.raw.stars));
        meditateList.add(new Meditate("Our Best Day Ever ", "made for  calm driving",R.raw.success1));
        meditateList.add(new Meditate("Dramatic Theme", "made for  focus driving",R.raw.success2));
        meditateList.add(new Meditate("Dramatic Cinematic", "made for thinking & driving",R.raw.sweep));
        meditateList.add(new Meditate("Elevation", "made for new day has come lets drive",R.raw.unforgettable));

        adapter = new MeditateAdapter(this, R.layout.list_item, meditateList);
        Log.d(TAG, "MeditateAdapter: " + adapter);
        songList.setAdapter(adapter);
    }
}