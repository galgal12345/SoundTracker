package com.drillgil.android.audiomusicplayer.Study;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.drillgil.android.audiomusicplayer.R;

import java.util.ArrayList;

public class StudyPlayer extends AppCompatActivity {

    private ArrayList<Study> studyList;
    private StudyAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_player);

        songList = (ListView)findViewById(R.id.study_list_view);
        studyList = new ArrayList<>();
        studyList.add(new Study("The Beginning", "made for morning inspiring driving",R.raw.victory1));
        studyList.add(new Study("Our Best Day Ever ", "made for  calm driving",R.raw.victory2));


        adapter = new StudyAdapter(this, R.layout.list_item, studyList);
        songList.setAdapter(adapter);
    }
}