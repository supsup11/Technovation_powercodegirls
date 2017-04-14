package com.strobertchs.story_game.SwitchScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.strobertchs.story_game.MainActivity;
import com.strobertchs.story_game.R;

public class switchScreenCredits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credits_layout);
    }

    public void back(View v) {
        Intent i = new Intent(switchScreenCredits.this, MainActivity.class);
        startActivity(i);
    }
}
