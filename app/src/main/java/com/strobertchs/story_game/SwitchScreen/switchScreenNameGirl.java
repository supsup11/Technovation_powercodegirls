package com.strobertchs.story_game.SwitchScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.strobertchs.story_game.R;

public class switchScreenNameGirl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name_girl);
    }

    public void next(View v) {
        Intent i = new Intent(switchScreenNameGirl.this, switchScreenGirlStory.class);
        startActivity(i);
    }

    public void back(View v) {
        Intent i = new Intent(switchScreenNameGirl.this, switchScreenChooseCharacter.class);
        startActivity(i);
    }
}
