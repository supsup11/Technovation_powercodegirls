package com.strobertchs.story_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.strobertchs.story_game.SwitchScreen.GirlBullyStory;

public class Ashley extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ashley);
    }

    public void next (View v) {
        Intent i = new Intent(Ashley.this, GirlBullyStory.class);
        startActivity(i);
    }

    public void back (View v) {
        Intent i = new Intent(Ashley.this, ChooseBully.class);
        startActivity(i);
    }
}
