package edu.cs.birzeit.workout_fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        WorkoutDetailFragment fgr = (WorkoutDetailFragment) getSupportFragmentManager().findFragmentById(R.id.frg_id);
        Intent intent = getIntent();
        long id =(long) intent.getExtras().get("WORKOUT_ID");


        fgr.setId(id);
    }
}
