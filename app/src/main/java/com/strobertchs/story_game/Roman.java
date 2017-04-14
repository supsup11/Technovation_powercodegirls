package com.strobertchs.story_game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.strobertchs.story_game.SwitchScreen.GirlBullyStory;
import com.strobertchs.story_game.SwitchScreen.switchScreenBoyBullyStory;

public class Roman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.roman);
    }

    public void next(View v) {
        Intent i = new Intent(Roman.this, switchScreenBoyBullyStory.class);
        startActivity(i);
    }

    public void back(View v) {
        Intent i = new Intent(Roman.this, ChooseBully.class);
        startActivity(i);
    }

}
