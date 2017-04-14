package com.strobertchs.story_game.SwitchScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.strobertchs.story_game.MainActivity;
import com.strobertchs.story_game.MySingleton;
import com.strobertchs.story_game.R;


public class switchScreenVictimBoyStory extends MainActivity implements View.OnClickListener {

    TextView heading, story;
    Button choice1, choice2, choice3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.victim_boy_story);

        heading = (TextView) findViewById(R.id.textView10);
        story = (TextView) findViewById(R.id.textView7);
        choice1 = (Button) findViewById(R.id.Choice1);
        choice2 = (Button) findViewById(R.id.Choice2);
        choice3 = (Button) findViewById(R.id.Choice3);

        choice1.setOnClickListener(this);
        choice2.setOnClickListener(this);
        choice3.setOnClickListener(this);

        choice1.setText("I look to see who threw it");
        choice2.setText("I pick up the ball");
        choice3.setText("I turn around");
    }

    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.Choice1) {
            if (choice1.getText() == "ENDING") {
                MySingleton.getInstance().setStrEnableLoad("y");
                MySingleton.getInstance().setStrEnableRoman("y");
                Intent i = new Intent(switchScreenVictimBoyStory.this, MainActivity.class);
                startActivity(i);
                //Button lockBtn = (Button) findViewById(R.id.loadGame);
                //Button roman = (Button) findViewById(R.id.roman);
                //lockBtn.setEnabled(true);
                //roman.setEnabled(true);
            }
            else if (choice1.getText() == "I look to see who threw it") {
                heading.setText("I LOOK TO SEE WHO THREW IT");
                story.setText(R.string.SeeWhoThrew);
                choice1.setText("ENDING");
                choice2.setText("I pick up the ball");
                choice3.setText("I turn around");
            } else if (choice1.getText() == "I keep walking") {
                heading.setText("I KEEP WALKING");
                story.setText(R.string.KeepWalking);
                choice1.setText("First period class");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "I think I was late to class") {
                heading.setText("FIRST PERIOD CLASS: 9:50am");
                story.setText(R.string.FirstPeriodLate);
                choice1.setText("Travel time");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "First period class") {
                heading.setText("FIRST PERIOD CLASS: 8:30am");
                story.setText(R.string.FirstPeriodOnTime);
                choice1.setText("Travel time");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Travel time") {
                heading.setText("TRAVEL TIME SECOND PERIOD: 9:50am");
                story.setText(R.string.TravelTime);
                choice1.setText("“N-n-nothing”");
                choice2.setText("Stare at him");
                choice3.setText("Turn around and walk the other way even though I’ll be late.");
            } else if (choice1.getText() == "“N-n-nothing”") {
                heading.setText("STUTTER (“N-n-nothing”)");
                story.setText(R.string.Stutter);
                choice1.setText("Second Period");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Second Period") {
                heading.setText("SECOND PERIOD");
                story.setText(R.string.SecondPeriod);
                choice1.setText("Who are you?");
                choice2.setText("Sure");
                choice3.setText("No");
            } else if (choice1.getText() == "Who are you?") {
                heading.setText("WHO ARE YOU");
                story.setText(R.string.who);
                choice1.setText("Second Period");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "She's creepy") {
                heading.setText("SHE’S CREEPY:");
                story.setText(R.string.creepy);
                choice1.setText("End of Day 1");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "End of Day 1") {
                heading.setText("END OF DAY 1");
                story.setText(R.string.dayOneEnd);
                choice1.setText("I open it");
                choice2.setText("I throw it");
                choice3.setText("");
            } else if (choice1.getText() == "I open it") {
                heading.setText("I OPEN IT:");
                story.setText(R.string.openIt);
                choice1.setText("I decide to go to Jennifer’s house");
                choice2.setText("I decide not to do anything");
                choice3.setText("I decide to text Jackson about it");
            } else if (choice1.getText() == "Next Day") {
                heading.setText("NEXT DAY:");
                story.setText(R.string.nextDay);
                choice1.setText("I rejected it");
                choice2.setText("I accepted it");
                choice3.setText("");
            } else if (choice1.getText() == "I rejected it") {
                heading.setText("I REJECTED IT");
                story.setText(R.string.rejected);
                choice1.setText("Skip class (No Cookie)");
                choice2.setText("Go to class (No Cookie)");
                choice3.setText("");
            } else if (choice1.getText() == "Skip class (Cookie)") {
                heading.setText("SKIP CLASS:");
                story.setText(R.string.skipClassYC);
                choice1.setText("Tell the truth (Cookie)");
                choice2.setText("Lie (Cookie)");
                choice3.setText("");
            } else if (choice1.getText() == "Tell the truth (Cookie)") {
                heading.setText("TELL THE TRUTH:");
                story.setText(R.string.tellTheTruthYC);
                choice1.setText("Stay in");
                choice2.setText("Come out");
                choice3.setText("");
            } else if (choice1.getText() == "Stay in") {
                heading.setText("STAY IN:");
                story.setText(R.string.stayIn);
                choice1.setText("After school");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Skip class (No Cookie)") {
                heading.setText("SKIP CLASS:");
                story.setText(R.string.skipClassNC);
                choice1.setText("Tell the truth (No Cookie)");
                choice2.setText("Lie (No Cookie)");
                choice3.setText("");
            } else if (choice1.getText() == "Tell the truth (No Cookie)") {
                heading.setText("TELL THE TRUTH:");
                story.setText(R.string.tellTheTruthNC);
                choice1.setText("Stay in");
                choice2.setText("Come out");
                choice3.setText("");
            } else if (choice1.getText() == "After school") {
                heading.setText("AFTER SCHOOL");
                story.setText(R.string.afterSchool_2);
                choice1.setText("And then");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "And then") {
                heading.setText("AND THEN");
                story.setText(R.string.hospital);
                choice1.setText("Then");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Then") {
                heading.setText("THEN");
                story.setText(R.string.afterHosp);
                choice1.setText("ENDING");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Next") {
                heading.setText("NEXT:");
                story.setText(R.string.afterSchool_2);
                choice1.setText("The Aftermath (1)");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "The Aftermath (1)") {
                heading.setText("THE AFTERMATH:");
                story.setText(R.string.afterSchool_3);
                choice1.setText("ENDING");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Lunch Buddies") {
                heading.setText("LUNCH BUDDIES:");
                story.setText(R.string.lunchBuddies);
                choice1.setText("Something is wrong");
                choice2.setText("Nothing is wrong");
                choice3.setText("");
            } else if (choice1.getText() == "Something is wrong") {
                heading.setText("SOMETHING IS WRONG:");
                story.setText(R.string.somethingWrong);
                choice1.setText("Encourage him");
                choice2.setText("Stop Him");
                choice3.setText("");
            } else if (choice1.getText() == "Encourage him") {
                heading.setText("ENCOURAGE HIM:");
                story.setText(R.string.encourageHim);
                choice1.setText("Next Day 2");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Next Day 2") {
                heading.setText("NEXT DAY 2:");
                story.setText(R.string.nextDay2);
                choice1.setText("ENDING");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Give him a cookie") {
                heading.setText("GIVE HIM A COOKIE:");
                story.setText(R.string.giveCookie);
                choice1.setText("Refuse the bag");
                choice2.setText("Take the bag");
                choice3.setText("");
            } else if (choice1.getText() == "Refuse the bag") {
                heading.setText("REFUSE THE BAG:");
                story.setText(R.string.refuseBag);
                choice1.setText("Finding Jackson");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Finding Jackson") {
                heading.setText("FINDING JACKSON:");
                story.setText(R.string.findingJackson);
                choice1.setText("Tell him");
                choice2.setText("Don’t tell him");
                choice3.setText("");
            } else if (choice1.getText() == "Tell him") {
                heading.setText("TELL HIM:");
                story.setText(R.string.tellHim);
                choice1.setText("Encourage him");
                choice2.setText("Stop Him");
                choice3.setText("");
            } else if (choice1.getText() == "No, don't confront Roman") {
                heading.setText("NO, DON'T CONFRONT ROMAN:");
                story.setText(R.string.notConfrontRoman);
                choice1.setText("The aftermath (2)");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "The aftermath (2)") {
                heading.setText("THE AFTERMATH:");
                story.setText(R.string.aftermath_2);
                choice1.setText("ENDING");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "The Confrontation") {
                heading.setText("THE CONFRONTATION:");
                story.setText(R.string.confrontation);
                choice1.setText("I do not forgive you");
                choice2.setText("I forgive you");
                choice3.setText("");
            } else if (choice1.getText() == "I do not forgive you") {
                heading.setText("I DO NOT FORGIVE YOU:");
                story.setText(R.string.notForgive);
                choice1.setText("ENDING");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "I decide to go to Jennifer’s house") {
                heading.setText("I DECIDE TO GO TO JENNIFER’S HOUSE:");
                story.setText(R.string.goToHouse);
                choice1.setText("“Jennifer”");
                choice2.setText("“Roman”");
                choice3.setText("");
            } else if (choice1.getText() == "“Jennifer”") {
                heading.setText("“JENNIFER”:");
                story.setText(R.string.sayJennifer);
                choice1.setText("Next Day (After visiting)");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Next Day (After visiting)") {
                heading.setText("NEXT DAY:");
                story.setText(R.string.nextDayVisited);
                choice1.setText("Read the note");
                choice2.setText("Don’t read the note");
                choice3.setText("");
            } else if (choice1.getText() == "Read the note") {
                heading.setText("READ THE NOTE:");
                story.setText(R.string.readNote);
                choice1.setText("Yes");
                choice2.setText("No");
                choice3.setText("");
            } else if (choice1.getText() == "Class") {
                heading.setText("CLASS:");
                story.setText(R.string.classTime);
                choice1.setText("After school with Jackson");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "After school with Jackson") {
                heading.setText("AFTER SCHOOL:");
                story.setText(R.string.afterSchoolWalking);
                choice1.setText("Tell him the truth");
                choice2.setText("Tell him a lie");
                choice3.setText("");
            } else if (choice1.getText() == "Tell him the truth") {
                heading.setText("TELL HIM THE TRUTH:");
                story.setText(R.string.tellHimTheTruth);
                choice1.setText("At the park");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Tell Jackson to stay") {
                heading.setText("TELL JACKSON TO STAY:");
                story.setText(R.string.jacksonStays);
                choice1.setText("ENDING");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "At the park") {
                heading.setText("AT THE PARK:");
                story.setText(R.string.atThePark);
                choice1.setText("YES");
                choice2.setText("NO");
                choice3.setText("");
            } else if (choice1.getText() == "Yes") {
                heading.setText("YES:");
                story.setText(R.string.sayYes);
                choice1.setText("Class");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Forgive him") {
                heading.setText("FORGIVE HIM:");
                story.setText(R.string.forgiveHim);
                choice1.setText("ENDING");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "YES") {
                heading.setText("YES:");
                story.setText(R.string.becomeFriends);
                choice1.setText("ENDING");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Yes we are") {
                heading.setText("YES WE ARE:");
                story.setText(R.string.yesWeAre);
                choice1.setText("ENDING");
                choice2.setText("");
                choice3.setText("");
            } else if (choice1.getText() == "Next Day (Didn't visit)") {
                heading.setText("NEXT DAY");
                story.setText(R.string.nextDay);
                choice1.setText("I rejected it");
                choice2.setText("I accepted it");
                choice3.setText("");
            }
        }


        else if (id == R.id.Choice2) {
            if (choice2.getText() == "I pick up the ball") {
                heading.setText("I PICK UP THE BALL");
                story.setText(R.string.PickUpBall);
                choice1.setText("I keep walking");
                choice2.setText("I give him the ball");
                choice3.setText("");
            } else if (choice2.getText() == "I give him the ball") {
                heading.setText("I GIVE HIM THE BALL");
                story.setText(R.string.GiveBall);
                choice1.setText("I think I was late to class");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Stare at him") {
                heading.setText("STARE AT HIM:");
                story.setText(R.string.Stare);
                choice1.setText("Second Period");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Sure") {
                heading.setText("SURE:");
                story.setText(R.string.sure);
                choice1.setText("She's creepy");
                choice2.setText("She's pretty");
                choice3.setText("");
            } else if (choice2.getText() == "She's pretty") {
                heading.setText("SHE’S PRETTY:");
                story.setText(R.string.pretty);
                choice1.setText("End of Day 1");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "I throw it") {
                heading.setText("I THROW IT:");
                story.setText(R.string.ThrowIt);
                choice1.setText("Next Day");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "I accepted it") {
                heading.setText("I ACCEPTED IT");
                story.setText(R.string.accepted);
                choice1.setText("Skip class (Cookie)");
                choice2.setText("Go to class (Cookie)");
                choice3.setText("");
            } else if (choice2.getText() == "Go to class (Cookie)") {
                heading.setText("GO TO CLASS:");
                story.setText(R.string.goToClassYC);
                choice1.setText("Finding Jackson");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Go to class (No Cookie)") {
                heading.setText("GO TO CLASS:");
                story.setText(R.string.goToClassNC);
                choice1.setText("After school");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Lie (Cookie)") {
                heading.setText("LIE:");
                story.setText(R.string.lieYC);
                choice1.setText("Give him a cookie");
                choice2.setText("Don't give him a cookie");
                choice3.setText("");
            } else if (choice2.getText() == "Don't give him a cookie") {
                heading.setText("DON'T GIVE HIM A COOKIE");
                story.setText(R.string.dontGiveCookie);
                choice1.setText("");
                choice2.setText("“I’ll do it”");
                choice3.setText("“Sorry, no can do”");
            } else if (choice2.getText() == "Lie (No Cookie)") {
                heading.setText("LIE");
                story.setText(R.string.lieNC);
                choice1.setText("");
                choice2.setText("“I’ll do it”");
                choice3.setText("“Sorry, no can do”");
            } else if (choice2.getText() == "Don’t give him a cookie") {
                heading.setText("DON’T GIVE HIM A COOKIE:");
                story.setText(R.string.notGiveCookie);
                choice1.setText("");
                choice2.setText("“I’ll do it”");
                choice3.setText("“Sorry, no can do”");
            } else if (choice2.getText() == "“I’ll do it”") {
                heading.setText("“I’LL DO IT”:");
                story.setText(R.string.doIt);
                choice1.setText("Finding Jackson");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Take the bag") {
                heading.setText("TAKE THE BAG:");
                story.setText(R.string.takeBag);
                choice1.setText("Finding Jackson");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Come out") {
                heading.setText("COME OUT:");
                story.setText(R.string.comeOut);
                choice1.setText("After school");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Don’t tell him") {
                heading.setText("DON’T TELL HIM:");
                story.setText(R.string.notTellHim);
                choice1.setText("Tell him");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Stop Him") {
                heading.setText("STOP HIM:");
                story.setText(R.string.stopHim);
                choice1.setText("No, don't confront Roman");
                choice2.setText("Yes, confront Roman");
                choice3.setText("");
            } else if (choice2.getText() == "Yes, confront Roman") {
                heading.setText("YES, CONFRONT ROMAN:");
                story.setText(R.string.confrontRoman);
                choice1.setText("The Confrontation");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "I forgive you") {
                heading.setText("I FORGIVE YOU:");
                story.setText(R.string.forgive);
                choice1.setText("ENDING");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "No") {
                heading.setText("NO:");
                story.setText(R.string.sayNo);
                choice1.setText("Class");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "I decide not to do anything") {
                heading.setText("I DECIDE NOT TO DO ANYTHING:");
                story.setText(R.string.notDoAnything);
                choice1.setText("Next Day (Didn't visit)");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "“Roman”") {
                heading.setText("“ROMAN”:");
                story.setText(R.string.sayRoman);
                choice1.setText("Next Day (After visiting)");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Don’t read the note") {
                heading.setText("DON’T READ THE NOTE:");
                story.setText(R.string.notReadNote);
                choice1.setText("Class");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Yes") {
                heading.setText("YES:");
                story.setText(R.string.sayYes);
                choice1.setText("Class");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Tell him a lie") {
                heading.setText("TELL HIM A LIE:");
                story.setText(R.string.tellALie);
                choice1.setText("Tell Jackson to stay");
                choice2.setText("Tell Jackson to go");
                choice3.setText("");
            } else if (choice2.getText() == "Tell Jackson to go") {
                heading.setText("TELL JACKSON TO GO:");
                story.setText(R.string.jacksonLeaves);
                choice1.setText("Forgive him");
                choice2.setText("Don’t forgive him");
                choice3.setText("");
            } else if (choice2.getText() == "NO") {
                heading.setText("NO:");
                story.setText(R.string.notFriends);
                choice1.setText("Yes we are");
                choice2.setText("No we aren’t");
                choice3.setText("");
            } else if (choice2.getText() == "Don’t forgive him") {
                heading.setText("DON’T FORGIVE HIM:");
                story.setText(R.string.notForgiveHim);
                choice1.setText("ENDING");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "No we aren’t") {
                heading.setText("NO WE AREN’T:");
                story.setText(R.string.noWeArent);
                choice1.setText("ENDING");
                choice2.setText("");
                choice3.setText("");
            } else if (choice2.getText() == "Nothing is wrong") {
                heading.setText("NOTHING IS WRONG:");
                story.setText(R.string.nothingWrong);
                choice1.setText("Something is wrong");
                choice2.setText("");
                choice3.setText("");
            }
        }


        else if (id == R.id.Choice3) {
            if (choice3.getText() == "Turn around and walk the other way even though I’ll be late.") {
                heading.setText("TURN AROUND AND WALK THE OTHER WAY ALTHOUGH I’LL BE LATE:");
                story.setText(R.string.TurnAround);
                choice1.setText("Second Period");
                choice2.setText("");
                choice3.setText("");
            } else if (choice3.getText() == "I turn around") {
                heading.setText("I TURN AROUND");
                story.setText(R.string.place);
                choice1.setText("I keep walking");
                choice2.setText("I give him the ball");
                choice3.setText("");
            } else if (choice3.getText() == "No") {
                heading.setText("NO");
                story.setText(R.string.no);
                choice1.setText("She's creepy");
                choice2.setText("She's pretty");
                choice3.setText("");
            } else if (choice3.getText() == "“Sorry, no can do”") {
                heading.setText("“SORRY, NO CAN DO”:");
                story.setText(R.string.noCanDo);
                choice1.setText("Lunch Buddies");
                choice2.setText("");
                choice3.setText("");
            } else if (choice3.getText() == "I decide to text Jackson about it") {
                heading.setText("I DECIDE TO TEXT JACKSON ABOUT IT:");
                story.setText(R.string.textJackson);
                choice1.setText("I decide to go to Jennifer’s house");
                choice2.setText("I decide not to do anything");
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