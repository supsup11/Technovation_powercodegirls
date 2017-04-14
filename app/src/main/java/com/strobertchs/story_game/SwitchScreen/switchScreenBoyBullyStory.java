package com.strobertchs.story_game.SwitchScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.strobertchs.story_game.MainActivity;
import com.strobertchs.story_game.R;

public class switchScreenBoyBullyStory extends AppCompatActivity implements View.OnClickListener {

    TextView heading, story;
    Button choice1, choice2, choice3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bully_boy_story);

        heading = (TextView) findViewById(R.id.textView6);
        story = (TextView) findViewById(R.id.textView8);
        choice1 = (Button) findViewById(R.id.Choice1);
        choice2 = (Button) findViewById(R.id.Choice2);
        choice3 = (Button) findViewById(R.id.Choice3);

        choice1.setOnClickListener(this);
        choice2.setOnClickListener(this);
        choice3.setOnClickListener(this);

        choice1.setText("School 7:45am");
        choice2.setText("");
        choice3.setText("");
        choice2.setVisibility(View.INVISIBLE);
        choice3.setVisibility(View.INVISIBLE);

    }

    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.Choice1) {
            if (choice1.getText() == "School 7:45am") {
                heading.setText("OUTSIDE SCHOOL: 7:45am");
                story.setText(R.string.atSchoolBBS);
                choice1.setText("Art Hallway");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Art Hallway") {
                heading.setText("ART HALLWAY: 8:00am");
                story.setText(R.string.artHallBBS);
                choice1.setText("Look at the boy (INFO)");
                choice2.setText("Throw the balled up paper at him");
                choice3.setText("");
            } else if (choice1.getText() == "Look at the boy (INFO)") {
                heading.setText("LOOK AT THE BOY (INFO)");
                story.setText(R.string.boyInfoBBS);
                choice1.setText("Art Hallway");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "He picks up the ball") {
                heading.setText("HE PICKS UP THE BALL");
                story.setText(R.string.pickUpBallBBS);
                choice1.setText("He gave it to me");
                choice2.setText("He kept walking");
                choice3.setText("");
            } else if (choice1.getText() == "He gave it to me") {
                heading.setText("HE GAVE IT TO ME");
                story.setText(R.string.giveMeBallBBS);
                choice1.setText("First Period");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "He forgives me") {
                heading.setText("HE FORGIVES ME");
                story.setText(R.string.heForgivesMeBBS);
                choice1.setText("");
                choice2.setText("");
                choice3.setText("ENDING");
            } else if (choice1.getText() == "First Period") {
                heading.setText("FIRST PERIOD");
                story.setText(R.string.firstPeriodBBS);
                choice1.setText("Travel Time");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Travel Time") {
                heading.setText("TRAVEL TIME");
                story.setText(R.string.travelTimeBBS);
                choice1.setText("He says nothing");
                choice2.setText("He stares at me");
                choice3.setText("He turns around");
            } else if (choice1.getText() == "He says nothing") {
                heading.setText("HE SAYS NOTHING");
                story.setText(R.string.heSaysNothingBBS);
                choice1.setText("Second Period");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Second Period") {
                heading.setText("SECOND PERIOD");
                story.setText(R.string.secondPeriodBBS);
                choice1.setText("End of Day 1");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "End of Day 1") {
                heading.setText("END OF DAY 1");
                story.setText(R.string.endOfDay1BBS);
                choice1.setText("Home");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Home") {
                heading.setText("HOME");
                story.setText(R.string.homeBBS);
                choice1.setText("Agree to leave");
                choice2.setText("Stay home");
                choice3.setText("");
            } else if (choice1.getText() == "Agree to leave") {
                heading.setText("AGREE TO LEAVE");
                story.setText(R.string.agreeToLeaveBBS);
                choice1.setText("Next Day");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Next Day") {
                heading.setText("NEXT DAY");
                story.setText(R.string.nextDayBBS);
                choice1.setText("Steal a note");
                choice2.setText("Steal his bag");
                choice3.setText("");
            } else if (choice1.getText() == "Steal a note") {
                heading.setText("STEAL A NOTE");
                story.setText(R.string.stealANoteBBS);
                choice1.setText("He said he read it");
                choice2.setText("He said he didn't read it");
                choice3.setText("");
            } else if (choice1.getText() == "Day 2") {
                heading.setText("DAY 2");
                story.setText(R.string.day2BBS);
                choice1.setText("I skipped third period");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "I skipped third period") {
                heading.setText("I SKIPPED THIRD PERIOD");
                story.setText(R.string.agreeToLeaveBBS);
                choice1.setText("No one answered");
                choice2.setText("Someone answered");
                choice3.setText("");
            } else if (choice1.getText() == "No one answered") {
                heading.setText("NO ONE ANSWERED");
                story.setText(R.string.noOneAnsweredBBS);
                choice1.setText("Lunch");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "He said he read it") {
                heading.setText("HE SAID HE READ IT");
                story.setText(R.string.heSaidHeReadItBBS);
                choice1.setText("School Ends");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "School Ends") {
                heading.setText("SCHOOL ENDS");
                story.setText(R.string.afterSchoolBBS);
                choice1.setText("He came with a friend");
                choice2.setText("He came alone");
                choice3.setText("");
            } else if (choice1.getText() == "He came with a friend") {
                heading.setText("HE CAME WITH A FRIEND");
                story.setText(R.string.heCameWithAFriendBBS);
                choice1.setText("He said yes");
                choice2.setText("He said no");
                choice3.setText("");
            } else if (choice1.getText() == "He said yes") {
                heading.setText("HE SAID YES");
                story.setText(R.string.heSaidYesBBS);
                choice1.setText("");
                choice2.setText("");
                choice3.setText("ENDING");
            } else if (choice1.getText() == "Justin returns") {
                heading.setText("JUSTIN RETURNS");
                story.setText(R.string.justinReturnsBBS);
                choice1.setText("");
                choice2.setText("");
                choice3.setText("ENDING");
            } else if (choice1.getText() == "He forgave me") {
                heading.setText("HE FORGAVE ME");
                story.setText(R.string.heForgaveMeBBS);
                choice1.setText("");
                choice2.setText("");
                choice3.setText("ENDING");
            } else if (choice1.getText() == "He said he was Andy") {
                heading.setText("HE SAID HE WAS ANDY");
                story.setText(R.string.heSaidHeWasAndyBBS);
                choice1.setText("He had a bag of cookies");
                choice2.setText("He apologized");
                choice3.setText("");
            } else if (choice1.getText() == "He had a bag of cookies") {
                heading.setText("HE HAD A BAG OF COOOKIES");
                story.setText(R.string.heHadABagOfCookiesBBS);
                choice1.setText("He took the bag");
                choice2.setText("He didn\'t take the bag");
                choice3.setText("");
            } else if (choice1.getText() == "He took the bag") {
                heading.setText("HE TOOK THE BAG");
                story.setText(R.string.heTookTheBagBBS);
                choice1.setText("Waiting outside school");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "He said he\'d do it") {
                heading.setText("HE SAID HE\'D DO IT");
                story.setText(R.string.heSaidHeWouldDoItBBS);
                choice1.setText("Waiting outside school");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Waiting outside school") {
                heading.setText("WAITING OUTSIDE SCHOOL");
                story.setText(R.string.waitingOutsideSchoolBBS);
                choice1.setText("No one came");
                choice2.setText("Jackson came");
                choice3.setText("Jackson and the boy came");
            } else if (choice1.getText() == "No one came") {
                heading.setText("NO ONE CAME");
                story.setText(R.string.noOneCameBBS);
                choice1.setText("Day 3");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Day 3") {
                heading.setText("DAY 3");
                story.setText(R.string.day3BBS);
                choice1.setText("");
                choice2.setText("");
                choice3.setText("ENDING");
            } else if (choice1.getText() == "He walked away") {
                heading.setText("HE WALKED AWAY");
                story.setText(R.string.heWalksAwayBBS);
                choice1.setText("First Period");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "I saw a note") {
                heading.setText("I SAW A NOTE");
                story.setText(R.string.iSawANoteBBS);
                choice1.setText("After school");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Lunch") {
                heading.setText("LUNCH");
                story.setText(R.string.lunchBBS);
                choice1.setText("I saw a note");
                choice2.setText("I saw cookies");
                choice3.setText("");
            } else if (choice1.getText() == "After school") {
                heading.setText("AFTER SCHOOL");
                story.setText(R.string.afterSchool2BBS);
                choice1.setText("Next");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Next") {
                heading.setText("NEXT");
                story.setText(R.string.nextBBS);
                choice1.setText("");
                choice2.setText("");
                choice3.setText("ENDING");
            } else if (choice1.getText() == "No one came out") {
                heading.setText("NO ONE CAME OUT");
                story.setText(R.string.noOneCameOutBBS);
                choice1.setText("After school");
                choice2.setText("");
                choice3.setText("");
            }

        } else if (id == R.id.Choice2) {
            if (choice2.getText() == "Throw the balled up paper at him") {
                heading.setText("THROW THE BALLED UP PAPER AT HIM");
                story.setText(R.string.throwPaperBBS);
                choice1.setText("He picks up the ball");
                choice2.setText("He walks away");
                choice3.setText("");
            } else if (choice2.getText() == "He walks away") {
                heading.setText("HE WALKS AWAY");
                story.setText(R.string.heWalkedAwayBBS);
                choice1.setText("He gave it to me");
                choice2.setText("He kept walking");
                choice3.setText("");
            } else if (choice2.getText() == "He came alone") {
                heading.setText("HE CAME ALONE");
                story.setText(R.string.heCameAloneBBS);
                choice1.setText("He forgave me");
                choice2.setText("He didn\'t forgive me");
                choice3.setText("");
            } else if (choice2.getText() == "I saw cookies") {
                heading.setText("I SAW COOKIES");
                story.setText(R.string.iSawCookiesBBS);
                choice1.setText("Waiting outside school");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Jackson came") {
                heading.setText("JACKSON CAME");
                story.setText(R.string.jacksonCameBBS);
                choice1.setText("");
                choice2.setText("");
                choice3.setText("ENDING");
            } else if (choice2.getText() == "He kept walking") {
                heading.setText("HE KEPT WALKING");
                story.setText(R.string.heWalksAwayBBS);
                choice1.setText("First Period");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "He apologized") {
                heading.setText("HE APOLOGIZED");
                story.setText(R.string.heApologizedBBS);
                choice1.setText("He said he\'d do it");
                choice2.setText("He said he wouldn\'t do it");
                choice3.setText("");
            } else if (choice2.getText() == "He didn\'t take the bag") {
                heading.setText("HE DIDN\'T TAKE THE BAG");
                story.setText(R.string.heDidntTakeTheBagBBS);
                choice1.setText("Waiting outside school");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "He said he wouldn\'t do it") {
                heading.setText("HE SAID HE WOULDN\'T DO IT");
                story.setText(R.string.heSaidHeWouldntDoItBBS);
                choice1.setText("Waiting outside school");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "He stares at me") {
                heading.setText("HE STARES AT ME");
                story.setText(R.string.heStaresAtMeBBS);
                choice1.setText("Second Period");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Stay home") {
                heading.setText("STAY HOME");
                story.setText(R.string.stayHomeBBS);
                choice1.setText("Day 2");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Someone answered") {
                heading.setText("SOMEONE ANSWERED");
                story.setText(R.string.someoneAnsweredBBS);
                choice1.setText("He said he was Andy");
                choice2.setText("He said he was Justin");
                choice3.setText("");
            } else if (choice2.getText() == "He said he was Justin") {
                heading.setText("HE SAID HE WAS JUSTIN");
                story.setText(R.string.heSaidHeWasJustinBBS);
                choice1.setText("No one came out");
                choice2.setText("Someone came out");
                choice3.setText("");
            } else if (choice2.getText() == "Someone came out") {
                heading.setText("SOMEONE CAME OUT");
                story.setText(R.string.someoneCameOutBBS);
                choice1.setText("After school");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "He does not forgive me") {
                heading.setText("HE DOES NOT FORGIVE ME");
                story.setText(R.string.heDoesNotForgiveMeBBS);
                choice1.setText("");
                choice2.setText("");
                choice3.setText("ENDING");
            } else if (choice2.getText() == "He said no") {
                heading.setText("HE SAID NO");
                story.setText(R.string.heSaidNoBBS);
                choice1.setText("Justin returns");
                choice2.setText("Justin leaves");
                choice3.setText("");
            } else if (choice2.getText() == "Steal his bag") {
                heading.setText("STEAL HIS BAG");
                story.setText(R.string.stealHisBagBBS);
                choice1.setText("School Ends");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "He said he didn\'t read it") {
                heading.setText("HE SAID HE DIDN\'T READ IT");
                story.setText(R.string.heSaidHeDidntReadItBBS);
                choice1.setText("School Ends");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "He didn\'t forgive me") {
                heading.setText("HE DIDN\'T FORGIVE ME");
                story.setText(R.string.heDidntForgiveMeBBS);
                choice1.setText("");
                choice2.setText("");
                choice3.setText("ENDING");
            } else if (choice2.getText() == "Justin leaves") {
                heading.setText("JUSTIN LEAVES");
                story.setText(R.string.justinLeavesBBS);
                choice1.setText("");
                choice2.setText("");
                choice3.setText("ENDING");
            }

        } else if (id == R.id.Choice3) {
            if (choice3.getText() == "ENDING") {
                Intent i = new Intent(switchScreenBoyBullyStory.this, MainActivity.class);
                startActivity(i);
            } else if (choice3.getText() == "Jackson and the boy came") {
                heading.setText("JACKSON AND THE BOY CAME");
                story.setText(R.string.jacksonAndTheBoyCameBBS);
                choice1.setText("He forgives me");
                choice2.setText("He does not forgive me");
                choice3.setText("");
            } else if (choice3.getText() == "He turns around") {
                heading.setText("HE TURNS AROUND");
                story.setText(R.string.heTurnsAroundBBS);
                choice1.setText("Second Period");
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
