package com.strobertchs.story_game.SwitchScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.strobertchs.story_game.ChooseBully;
import com.strobertchs.story_game.MainActivity;
import com.strobertchs.story_game.MySingleton;
import com.strobertchs.story_game.R;

public class switchScreenGirlStory extends AppCompatActivity implements View.OnClickListener {

    TextView heading, story;
    Button choice1, choice2, choice3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.victim_girl_story);

        heading = (TextView) findViewById(R.id.textView15);
        story = (TextView) findViewById(R.id.textView9);
        choice1 = (Button) findViewById(R.id.Choice1);
        choice2 = (Button) findViewById(R.id.Choice2);
        choice3 = (Button) findViewById(R.id.Choice3);

        choice1.setOnClickListener(this);
        choice2.setOnClickListener(this);
        choice3.setOnClickListener(this);

        choice1.setText("Stare at them");
        choice2.setText("Ask what’s their problem");
        choice3.setText("Ignore them");

    }

    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.Choice1) {
                if (choice1.getText() == "ENDING") {
                    MySingleton.getInstance().setStrEnableLoad("y");
                    MySingleton.getInstance().setStrEnableAshley("y");
                    Intent i = new Intent(switchScreenGirlStory.this, MainActivity.class);
                    startActivity(i);
                } else if (choice1.getText() == "Stare at them") {
                    heading.setText("STARE AT THEM");
                    story.setText(R.string.stareAtThemVGS);
                    choice1.setText("Class Ends");
                    choice2.setText("");
                    choice3.setText("");
                } else if (choice1.getText() == "Class Ends") {
                    heading.setText("CLASS ENDS");
                    story.setText(R.string.classEndsVGS);
                    choice1.setText("STARE");
                    choice2.setText("ASK HER WHAT'S THEIR PROBLEM");
                    choice3.setText("BE AGGRESSIVE");
                } else if (choice1.getText() == "STARE") {
                    heading.setText("STARE");
                    story.setText(R.string.stareVGS);
                    choice1.setText("Second Period");
                    choice2.setText("");
                    choice3.setText("");
                } else if (choice1.getText() == "TUG ON YOUR BAG REALLY HARD") {
                    heading.setText("TUG ON YOUR BAG REALLY HARD");
                    story.setText(R.string.tugOnBagHardVGS);
                    choice1.setText("Second Period");
                    choice2.setText("");
                    choice3.setText("");
                } else if (choice1.getText() == "Second Period") {
                    heading.setText("Second Period: 9:53 am");
                    story.setText(R.string.secondPeriodVGS);
                    choice1.setText("WORK ALONE IN A CORNER");
                    choice2.setText("JOIN A GROUP AND WATCH");
                    choice3.setText("");
                } else if (choice1.getText() == "WORK ALONE IN A CORNER") {
                    heading.setText("Work Alone In A Corner");
                    story.setText(R.string.workAloneVGS);
                    choice1.setText("END OF SCHOOL");
                    choice2.setText("");
                    choice3.setText("");
                } else if (choice1.getText() == "WHAT ABOUT IT?") {
                    heading.setText("WHAT ABOUT IT?");
                    story.setText(R.string.whatAbout);
                    choice1.setText("END OF SCHOOL");
                    choice2.setText("");
                    choice3.setText("");
                } else if (choice1.getText() == "END OF SCHOOL") {
                    heading.setText("END OF SCHOOL 2:35 pm");
                    story.setText(R.string.endOfSchool);
                    choice1.setText("NEXT");
                    choice2.setText("");
                    choice3.setText("");
                } else if (choice1.getText() == "NEXT") {
                    heading.setText("Next day");
                    story.setText(R.string.nextDayVGS);
                    choice1.setText("Get mad and yell at them");
                    choice2.setText("Hide and eavesdrop");
                    choice3.setText("Pretend you don’t see them");
                } else if (choice1.getText() == "Get mad and yell at them") {
                    heading.setText("GET MAD AND YELL AT THEM");
                    story.setText(R.string.getMad);
                    choice1.setText("ENDING");
                    choice2.setText("");
                    choice3.setText("");
                } else if (choice1.getText() == "At School") {
                    heading.setText("AT SCHOOL");
                    story.setText(R.string.AtSchool);
                    choice1.setText("Look at her");
                    choice2.setText("Yes?");
                    choice3.setText("Keep your head down and go to your seat");
                } else if (choice1.getText() == "Look at her") {
                    heading.setText("LOOK AT HER:");
                    story.setText(R.string.lookAtHer);
                    choice1.setText("At My Seat");
                    choice2.setText("");
                    choice3.setText("");
                } else if (choice1.getText() == "At My Seat") {
                    heading.setText("AT MY SEAT");
                    story.setText(R.string.nurseChat);
                    choice1.setText("At home");
                    choice2.setText("");
                    choice3.setText("");
                } else if (choice1.getText() == "At home") {
                    heading.setText("AT HOME");
                    story.setText(R.string.atHome);
                    choice1.setText("In My Room");
                    choice2.setText("");
                    choice3.setText("");
                } else if (choice1.getText() == "In My Room") {
                    heading.setText("IN MY ROOM");
                    story.setText(R.string.inMyRoom);
                    choice1.setText("The Next Day");
                    choice2.setText("");
                    choice3.setText("");
                } else if (choice1.getText() == "The Next Day") {
                    heading.setText("THE NEXT DAY");
                    story.setText(R.string.theNextDay);
                    choice1.setText("After School");
                    choice2.setText("");
                    choice3.setText("");
                } else if (choice1.getText() == "After School") {
                    heading.setText("AFTER SCHOOL");
                    story.setText(R.string.meetingAshely);
                    choice1.setText("ENDING");
                    choice2.setText("");
                    choice3.setText("");
                }

            }
        if (id == R.id.Choice2) {
            if (choice2.getText() == "Ask what’s their problem") {
                heading.setText("ASK WHAT’S THEIR PROBLEM");
                story.setText(R.string.askProblemVGS);
                choice1.setText("Class Ends");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "ASK HER WHAT'S THEIR PROBLEM") {
                heading.setText("Ask Her What's Their Problem");
                story.setText(R.string.askWhatSheWantVGS);
                choice1.setText("Second Period");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "QUIETLY GIVE UP YOUR BAG") {
                heading.setText("Quietly Give Up Your Bag");
                story.setText(R.string.giveUpBagVGS);
                choice1.setText("Second Period");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "JOIN A GROUP AND WATCH") {
                heading.setText("JOIN A GROUP");
                story.setText(R.string.joinGroup);
                choice1.setText("WHAT ABOUT IT?");
                choice2.setText("NO, AND I DON'T CARE");
                choice3.setText("");
            } else if (choice2.getText() == "NO, AND I DON'T CARE") {
                heading.setText("NO, AND I DON'T CARE");
                story.setText(R.string.noIDontCare);
                choice1.setText("END OF SCHOOL");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Hide and eavesdrop") {
                heading.setText("HIDE AND EAVESDROP");
                story.setText(R.string.hideAndEavesdrop);
                choice1.setText("At School");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Yes?") {
                heading.setText("YES?");
                story.setText(R.string.yes);
                choice1.setText("At My Seat");
                choice2.setText("");
                choice3.setText("");
            }
        }

        else if (id == R.id.Choice3) {
            if (choice3.getText() == "Ignore them") {
                heading.setText("IGNORE THEM");
                story.setText(R.string.ignoreThemVGS);
                choice1.setText("Class Ends");
                choice2.setText("");
                choice3.setText("");
            } else if (choice3.getText() == "BE AGGRESSIVE") {
                heading.setText("Be Aggressive");
                story.setText(R.string.beAggresiveVGS);
                choice1.setText("TUG ON YOUR BAG REALLY HARD");
                choice2.setText("QUIETLY GIVE UP YOUR BAG");
                choice3.setText("HELP!!!");
            } else if (choice3.getText() == "HELP!!!") {
                heading.setText("HELP!!!");
                story.setText(R.string.helpVGS);
                choice1.setText("Second Period");
                choice2.setText("");
                choice3.setText("");
            } else if (choice3.getText() == "Pretend you don’t see them") {
                heading.setText("PRETEND YOU DON'T SEE THEM");
                story.setText(R.string.pretendDontSee);
                choice1.setText("At School");
                choice2.setText("");
                choice3.setText("");
            } else if (choice3.getText() == "Keep your head down and go to your seat") {
                heading.setText("KEEP YOUR HEAD DOWN AND GO TO YOUR SEAT");
                story.setText(R.string.pretendDontSee);
                choice1.setText("At My Seat");
                choice2.setText("");
                choice3.setText("");
            }
        }


        if (choice1.getText() == "") {
            choice1.setVisibility(View.GONE);
        } else {
            choice1.setVisibility(View.VISIBLE);
        }
        if (choice2.getText() == "") {
            choice2.setVisibility(View.INVISIBLE);
        } else {
            choice2.setVisibility(View.VISIBLE);
        }
        if (choice3.getText() == "") {
            choice3.setVisibility(View.INVISIBLE);
        } else {
            choice3.setVisibility(View.VISIBLE);
        }
        if (choice3.getText() == "") {
            choice3.setVisibility(View.INVISIBLE);
        } else {
            choice3.setVisibility(View.VISIBLE);
        }

    }
}


