package com.strobertchs.story_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.strobertchs.story_game.SwitchScreen.GirlBullyStory;
import com.strobertchs.story_game.SwitchScreen.switchScreenChooseCharacter;
import com.strobertchs.story_game.SwitchScreen.switchScreenCredits;
import com.strobertchs.story_game.SwitchScreen.switchScreenExit;

import static com.strobertchs.story_game.R.id.loadGame;

public class MainActivity extends AppCompatActivity {

    public String strEnableBoy;
    public String strEnableGirl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(MySingleton.getInstance().getStrEnableLoad() == "y"){
            Button lockBtn = (Button) findViewById(R.id.loadGame);
            lockBtn.setEnabled(true);}
        else{
            Button lockBtn = (Button) findViewById(R.id.loadGame);
            lockBtn.setEnabled(false);
            }
        }


    public void newGame(View v) {
        Intent i = new Intent(MainActivity.this, switchScreenChooseCharacter.class);
        startActivity(i);
    }

    public void credits(View v) {
        Intent i = new Intent(MainActivity.this, switchScreenCredits.class);
        startActivity(i);
    }

    public void quit(View v) {
        Intent i = new Intent(MainActivity.this, switchScreenExit.class);
        startActivity(i);
    }

    public void loadGame(View v) {
        Intent i = new Intent(MainActivity.this, ChooseBully.class);
        startActivity(i);
    }


}


