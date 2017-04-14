package com.strobertchs.story_game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.strobertchs.story_game.SwitchScreen.GirlBullyStory;

public class ashy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ashley);
    }

    public void next(View v) {
        Intent i = new Intent(ashy.this, GirlBullyStory.class);
        startActivity(i);
    }

    public void back(View v) {
        Intent i = new Intent(ashy.this, ChooseBully.class);
        startActivity(i);
    }

}
