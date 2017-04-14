package com.strobertchs.story_game.SwitchScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.strobertchs.story_game.MainActivity;
import com.strobertchs.story_game.R;

public class GirlBullyStory extends AppCompatActivity implements View.OnClickListener {

    TextView heading, story;
    Button choice1, choice2, choice3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bully_girl_story);

        heading = (TextView) findViewById(R.id.textView16);
        story = (TextView) findViewById(R.id.textView12);
        choice1 = (Button) findViewById(R.id.Choice1);
        choice2 = (Button) findViewById(R.id.Choice2);
        choice3 = (Button) findViewById(R.id.Choice3);

        choice1.setOnClickListener(this);
        choice2.setOnClickListener(this);
        choice3.setOnClickListener(this);

        choice1.setText("The Park");
        choice2.setText("The School");
        choice3.setText("");
        choice3.setVisibility(View.INVISIBLE);
    }

    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.Choice1) {
            if (choice1.getText() == "THE END") {
                Intent i = new Intent(GirlBullyStory.this, MainActivity.class);
                startActivity(i);
            }
            else if (choice1.getText() == "The Park") {
                heading.setText("THE PARK");
                story.setText(R.string.theParkGBS);
                choice1.setText("Next Day");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Yes") {
                heading.setText("YES");
                story.setText(R.string.sureBGS);
                choice1.setText("At School");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "At School") {
                heading.setText("AT SCHOOL");
                story.setText(R.string.atSchoolBGS);
                choice1.setText("During Class");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "During Class") {
                heading.setText("DURING CLASS");
                story.setText(R.string.duringClassBGS);
                choice1.setText("After Class");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "After Class") {
                heading.setText("AFTER CLASS");
                story.setText(R.string.afterClassBGS);
                choice1.setText("Second Period");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Second Period") {
                heading.setText("SECOND PERIOD");
                story.setText(R.string.secondPeriodBGS);
                choice1.setText("End of School");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "End of School") {
                heading.setText("END OF SCHOOL");
                story.setText(R.string.endOfSchoolBGS);
                choice1.setText("Sure, get in");
                choice2.setText("Why?");
                choice3.setText("No way");
            }else if (choice1.getText() == "Sure, get in") {
                heading.setText("SURE, GET IN");
                story.setText(R.string.sureJacksonBGS);
                choice1.setText("The next day");
                choice2.setText("");
                choice3.setText("");
            }else if (choice1.getText() == "The next day") {
                heading.setText("THE NEXT DAY");
                story.setText(R.string.theNextDayBGS);
                choice1.setText("At the park");
                choice2.setText("");
                choice3.setText("");
            }else if (choice1.getText() == "At the park") {
                heading.setText("AT THE PARK");
                story.setText(R.string.atThePark2BGS);
                choice1.setText("At school");
                choice2.setText("");
                choice3.setText("");
            }else if (choice1.getText() == "At school") {
                heading.setText("AT SCHOOL");
                story.setText(R.string.atSchool2BGS);
                choice1.setText("Class");
                choice2.setText("");
                choice3.setText("");
            }else if (choice1.getText() == "Class") {
                heading.setText("CLASS");
                story.setText(R.string.classBGS);
                choice1.setText("Tell the teacher");
                choice2.setText("Ignore it");
                choice3.setText("");
            }else if (choice1.getText() == "Tell the teacher") {
                heading.setText("TELL THE TEACHER");
                story.setText(R.string.tellTheTeacherBGS);
                choice1.setText("At home");
                choice2.setText("");
                choice3.setText("");
            }else if (choice1.getText() == "At home") {
                heading.setText("AT HOME");
                story.setText(R.string.atHomeBGS);
                choice1.setText("In the car");
                choice2.setText("");
                choice3.setText("");
            }else if (choice1.getText() == "In the car") {
                heading.setText("IN THE CAR");
                story.setText(R.string.inTheCarBGS);
                choice1.setText("Next Day");
                choice2.setText("");
                choice3.setText("");
            }else if (choice1.getText() == "Next Day") {
                heading.setText("NEXT DAY");
                story.setText(R.string.nextDay2BGS);
                choice1.setText("At the park again");
                choice2.setText("");
                choice3.setText("");
            }else if (choice1.getText() == "At the park again") {
                heading.setText("AT THE PARK AGAIN");
                story.setText(R.string.atThePark3BGS);
                choice1.setText("After School Again");
                choice2.setText("");
                choice3.setText("");
            }else if (choice1.getText() == "After School Again") {
                heading.setText("AFTER SCHOOL AGAIN");
                story.setText(R.string.afterSchool2BGS);
                choice1.setText("The Ending");
                choice2.setText("");
                choice3.setText("");
            }else if (choice1.getText() == "The Ending") {
                heading.setText("THE ENDING");
                story.setText(R.string.theEndBGS);
                choice1.setText("THE END");
                choice2.setText("");
                choice3.setText("");
            }


        } else if (id == R.id.Choice2) {
            if (choice2.getText() == "The School") {
                heading.setText("THE SCHOOL");
                story.setText(R.string.theSchoolGBS);
                choice1.setText("Next Day");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "At the Park") {
                heading.setText("AT THE PARK");
                story.setText(R.string.atTheParkBGS);
                choice1.setText("Sure");
                choice2.setText("No");
                choice3.setText("Yeah but next time I won\'t");
            } else if (choice2.getText() == "No") {
                heading.setText("NO");
                story.setText(R.string.noBGS);
                choice1.setText("At School");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Why?") {
                heading.setText("WHY?");
                story.setText(R.string.whyJacksonBGS);
                choice1.setText("The next day");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Ignore it") {
                heading.setText("IGNORE IT");
                story.setText(R.string.ignoreItBGS);
                choice1.setText("At home");
                choice2.setText("");
                choice3.setText("");
            }

        } else if (id == R.id.Choice3) {
            if (choice3.getText() == "The School") {
                heading.setText("");
                story.setText(R.string.theSchoolGBS);
                choice1.setText("");
                choice2.setText("");
                choice3.setText("");
            } else if (choice3.getText() == "Yeah but next time I won\'t") {
                heading.setText("YEAH BUT NEXT TIME I WON\'T");
                story.setText(R.string.yeahButNextTimeIWontBGS);
                choice1.setText("At School");
                choice2.setText("");
                choice3.setText("");
            } else if (choice3.getText() == "No way") {
                heading.setText("NO WAY");
                story.setText(R.string.noJacksonBGS);
                choice1.setText("The next day");
                choice2.setText("");
                choice3.setText("");
            }
        }

        if (choice1.getText() == "") {
            choice1.setVisibility(View.INVISIBLE);
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

    }
}
