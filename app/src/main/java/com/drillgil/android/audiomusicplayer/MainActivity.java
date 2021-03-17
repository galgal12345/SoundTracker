package com.drillgil.android.audiomusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.drillgil.android.audiomusicplayer.GoodVibes.GoodVibesPlayer;
import com.drillgil.android.audiomusicplayer.Meditate.MeditatePlayer;
import com.drillgil.android.audiomusicplayer.OnTheWay.OnTheWayPlayer;
import com.drillgil.android.audiomusicplayer.Study.StudyPlayer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the onTheWay category
        TextView onTheWay = (TextView) findViewById(R.id.on_the_way);

        // Set a click listener on that View
        // The code in this method will be executed when the onTheWay category is clicked on.
        onTheWay.setOnClickListener(view -> {
            // Create a new intent to open the {@link NumbersActivity}
            Intent onTheWayIntent = new Intent(MainActivity.this, OnTheWayPlayer.class);

            // Start the new activity
            startActivity(onTheWayIntent);
        });

        // Find the View that shows the family category
        TextView meditate = (TextView) findViewById(R.id.meditate);

        // Set a click listener on that View
        // The code in this method will be executed when the family category is clicked on.
        meditate.setOnClickListener(view -> {
            // Create a new intent to open the {@link FamilyActivity}
            Intent meditateIntent = new Intent(MainActivity.this, MeditatePlayer.class);

            // Start the new activity
            startActivity(meditateIntent);
        });

        // Find the View that shows the colors category
        TextView study = (TextView) findViewById(R.id.study);

        // Set a click listener on that View
        // The code in this method will be executed when the colors category is clicked on.
        study.setOnClickListener(view -> {
            // Create a new intent to open the {@link ColorsActivity}
            Intent studyIntent = new Intent(MainActivity.this, StudyPlayer.class);

            // Start the new activity
            startActivity(studyIntent);
        });

        // Find the View that shows the phrases category
        TextView goodVibes = (TextView) findViewById(R.id.good_vibes);

        // Set a click listener on that View
        // The code in this method will be executed when the phrases category is clicked on.
        goodVibes.setOnClickListener(view -> {
            // Create a new intent to open the {@link PhrasesActivity}
            Intent goodVibesIntent = new Intent(MainActivity.this, GoodVibesPlayer.class);

            // Start the new activity
            startActivity(goodVibesIntent);
        });

    }
}