package com.strobertchs.story_game.SwitchScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.strobertchs.story_game.MainActivity;
import com.strobertchs.story_game.R;

public class switchScreenChooseCharacter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_character);
    }

    public void back(View v) {
        Intent i = new Intent(switchScreenChooseCharacter.this, MainActivity.class);
        startActivity(i);
    }

    public void male(View v) {
        Intent i = new Intent(switchScreenChooseCharacter.this, switchScreenNameBoy.class);
        startActivity(i);
    }

    public void female(View v) {
        Intent i = new Intent(switchScreenChooseCharacter.this, switchScreenNameGirl.class);
        startActivity(i);
    }

}

