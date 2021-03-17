package com.drillgil.android.audiomusicplayer.OnTheWay;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.drillgil.android.audiomusicplayer.R;

import java.util.ArrayList;

public class OnTheWayPlayer extends AppCompatActivity {

    private ArrayList<OnTheWay> OnTheWayList;
    private OnTheWayAdapter adapter;
    private ListView songList;

    private static final String TAG = "OnTheWayActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_the_way_player);

        songList = (ListView)findViewById(R.id.on_the_way_list_view);
        OnTheWayList = new ArrayList<>();
        OnTheWayList.add(new OnTheWay("The Beginning", "made for morning inspiring driving",R.raw.beginning));
        OnTheWayList.add(new OnTheWay("Our Best Day Ever ", "made for  calm driving",R.raw.best));
        OnTheWayList.add(new OnTheWay("Dramatic Theme", "made for  focus driving",R.raw.dramatic1));
        OnTheWayList.add(new OnTheWay("Dramatic Cinematic", "made for thinking & driving",R.raw.dramatic2));
        OnTheWayList.add(new OnTheWay("Elevation", "made for new day has come lets drive",R.raw.elevation));

        adapter = new OnTheWayAdapter(this, R.layout.list_item, OnTheWayList);
        Log.d(TAG, "OnTheWayAdapter: " + adapter);
        songList.setAdapter(adapter);

    }



}


