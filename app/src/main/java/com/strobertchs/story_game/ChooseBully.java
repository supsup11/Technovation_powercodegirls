package com.strobertchs.story_game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.strobertchs.story_game.R.layout.activity_main;

public class ChooseBully extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_bully);
        if(MySingleton.getInstance().getStrEnableRoman() == "y"){
            Button lockBtn = (Button) findViewById(R.id.roman);
            lockBtn.setEnabled(true);}
        else{
            Button lockBtn = (Button) findViewById(R.id.roman);
            lockBtn.setEnabled(false);
        }
        if(MySingleton.getInstance().getStrEnableAshley() == "y"){
            Button lockBtn = (Button) findViewById(R.id.ashley);
            lockBtn.setEnabled(true);}
        else{
            Button lockBtn = (Button) findViewById(R.id.ashley);
            lockBtn.setEnabled(false);
        }
    }

    public void ashley (View v) {
        //Intent i = new Intent(ChooseBully.this, Ashley.class);
        //startActivity(i);
        Toast.makeText(this, "To be continued!",
                Toast.LENGTH_SHORT).show();
    }

    public void roman(View v) {
        Intent i = new Intent(ChooseBully.this, Roman.class);
        startActivity(i);
    }

    public void back (View v) {
        Intent i = new Intent(ChooseBully.this, MainActivity.class);
        startActivity(i);
    }

}

