package com.example.android.greatdaychallenge;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    int sumNoActivityA = 0;
    int sumActiveMinutesA = 0;
    int sumHealthyFoodA = 0;
    int sumBonusA = 0;
    int sumNoActivityB = 0;
    int sumActiveMinutesB = 0;
    int sumHealthyFoodB = 0;
    int sumBonusB = 0;
    String whoWinA = "";
    String whoWinB = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * Delete EditText on click on button - I call this instead of onCreate in activity_main.xml layout
         */

        final Button btnDeleteB = (Button) findViewById(R.id.deleteB);
        final EditText etPlayerNameB = (EditText) findViewById(R.id.playerNameB);

        final Button btnDeleteA = (Button) findViewById(R.id.deleteA);
        final EditText etPlayerNameA = (EditText) findViewById(R.id.playerNameA);

        btnDeleteA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etPlayerNameA.setText("");
            }
        });

        btnDeleteB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etPlayerNameB.setText("");
            }
        });
    }


    /**
     * Add 30 minutes for player A, add +1 sum activity number, add 30 minutes summary minutes.
     */
    protected void add30MinutesA(View view) {
        scoreA = (scoreA + 30);
        sumNoActivityA = (sumNoActivityA + 1);
        sumActiveMinutesA = (sumActiveMinutesA + 30);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA > scoreB) {
                whoWinA = "I´m better";
                whoWinB = "Step on!";
            }
        }

        displayScoreA(scoreA);
        displaySumNoActivityA(sumNoActivityA);
        displaySumActiveMinutesA(sumActiveMinutesA);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Add 60 minutes for player A, add +1 sum activity number, add 60 minutes summary minutes.
     */
    protected void add60MinutesA(View view) {
        scoreA = (scoreA + 60);
        sumNoActivityA = (sumNoActivityA + 1);
        sumActiveMinutesA = (sumActiveMinutesA + 60);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA > scoreB) {
                whoWinA = "I´m great";
                whoWinB = "Step on!";
            }
        }
        displayScoreA(scoreA);
        displaySumNoActivityA(sumNoActivityA);
        displaySumActiveMinutesA(sumActiveMinutesA);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Add 90 minutes for player A, add +1 sum activity number, add 90 minutes summary minutes.
     */
    protected void add90MinutesA(View view) {
        scoreA = (scoreA + 90);
        sumNoActivityA = (sumNoActivityA + 1);
        sumActiveMinutesA = (sumActiveMinutesA + 90);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA > scoreB) {
                whoWinA = "I´m amazing";
                whoWinB = "Step on!";
            }

        }
        displayScoreA(scoreA);
        displaySumNoActivityA(sumNoActivityA);
        displaySumActiveMinutesA(sumActiveMinutesA);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Add 120 minutes for player A, add +1 sum activity number, add 90 minutes summary minutes.
     */
    protected void add120MinutesA(View view) {
        scoreA = (scoreA + 120);
        sumNoActivityA = (sumNoActivityA + 1);
        sumActiveMinutesA = (sumActiveMinutesA + 120);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA > scoreB) {
                whoWinA = "I´m best";
                whoWinB = "Step on!";
            }
        }
        displayScoreA(scoreA);
        displaySumNoActivityA(sumNoActivityA);
        displaySumActiveMinutesA(sumActiveMinutesA);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Add 30 minutes for Healthy food for player A, add 30 minutes for summary Healthy.
     */
    protected void add30HealthyA(View view) {
        scoreA = (scoreA + 30);
        sumHealthyFoodA = (sumHealthyFoodA + 30);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA > scoreB) {
                whoWinA = "Great!!!";
                whoWinB = "Step on!";
            }
        }
        displayScoreA(scoreA);
        displaySumHealthyFoodA(sumHealthyFoodA);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Lose 30 minutes for Junky food for player A, lose 30 minutes for summary Healthy.
     */
    protected void lose30HealthyA(View view) {
        scoreA = (scoreA - 30);
        sumHealthyFoodA = (sumHealthyFoodA - 30);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA > scoreB) {
                whoWinA = "Nooo :-(";
                whoWinB = "Step on!";
            }
        }
        displayScoreA(scoreA);
        displaySumHealthyFoodA(sumHealthyFoodA);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Add 30 for New skills for player A and 30 to summary Bonus.
     */
    protected void add30SkillsA(View view) {
        scoreA = (scoreA + 30);
        sumBonusA = (sumBonusA + 30);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA > scoreB) {
                whoWinA = "Great work";
                whoWinB = "Step on!";
            }
        }
        displayScoreA(scoreA);
        displaySumBonusA(sumBonusA);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Add 30 for Goodnes for player A and 30 to summary Bonus.
     */
    protected void add30GoodA(View view) {
        scoreA = (scoreA + 30);
        sumBonusA = (sumBonusA + 30);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA > scoreB) {
                whoWinA = "Amazing!";
                whoWinB = "Step on!";
            }
        }
        displayScoreA(scoreA);
        displaySumBonusA(sumBonusA);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }


    /**
     * Displays the given score for Player A.
     */
    public void displayScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays summary number of activities for Player A.
     */
    public void displaySumNoActivityA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sumNoActivityA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of activities minutes for Player A.
     */
    public void displaySumActiveMinutesA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sumActiveMinutesA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays summary healthy food points for Player A.
     */
    public void displaySumHealthyFoodA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sumHealthyFoodA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays summary of bonus for Player A.
     */
    public void displaySumBonusA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sumBonusA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * second part of layout
     */


    /**
     * Add 30 minutes for Player B, add +1 sum activity number, add 30 minutes summary minutes.
     */
    protected void add30MinutesB(View view) {
        scoreB = (scoreB + 30);
        sumNoActivityB = (sumNoActivityB + 1);
        sumActiveMinutesB = (sumActiveMinutesB + 30);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA < scoreB) {
                whoWinB = "I´m better";
                whoWinA = "Step on!";
            }
        }

        displayScoreB(scoreB);
        displaySumNoActivityB(sumNoActivityB);
        displaySumActiveMinutesB(sumActiveMinutesB);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Add 60 minutes for Player B, add +1 sum activity number, add 60 minutes summary minutes.
     */
    protected void add60MinutesB(View view) {
        scoreB = (scoreB + 60);
        sumNoActivityB = (sumNoActivityB + 1);
        sumActiveMinutesB = (sumActiveMinutesB + 60);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA < scoreB) {
                whoWinB = "I´m great";
                whoWinA = "Step on!";
            }
        }
        displayScoreB(scoreB);
        displaySumNoActivityB(sumNoActivityB);
        displaySumActiveMinutesB(sumActiveMinutesB);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Add 90 minutes for player B, add +1 sum activity number, add 90 minutes summary minutes.
     */
    protected void add90MinutesB(View view) {
        scoreB = (scoreB + 90);
        sumNoActivityB = (sumNoActivityB + 1);
        sumActiveMinutesB = (sumActiveMinutesB + 90);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA < scoreB) {
                whoWinB = "I´m amazing";
                whoWinA = "Step on!";
            }
        }

        displayScoreB(scoreB);
        displaySumNoActivityB(sumNoActivityB);
        displaySumActiveMinutesB(sumActiveMinutesB);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Add 120 minutes for player B, add +1 sum activity number, add 90 minutes summary minutes.
     */
    protected void add120MinutesB(View view) {
        scoreB = (scoreB + 120);
        sumNoActivityB = (sumNoActivityB + 1);
        sumActiveMinutesB = (sumActiveMinutesB + 120);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA < scoreB) {
                whoWinB = "I´m best";
                whoWinA = "Step on!";
            }
        }
        displayScoreB(scoreB);
        displaySumNoActivityB(sumNoActivityB);
        displaySumActiveMinutesB(sumActiveMinutesB);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Add 30 minutes for Healthy food for player B, add 30 minutes for summary Healthy.
     */
    protected void add30HealthyB(View view) {
        scoreB = (scoreB + 30);
        sumHealthyFoodB = (sumHealthyFoodB + 30);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA < scoreB) {
                whoWinB = "Great!!!";
                whoWinA = "Step on!";
            }
        }
        displayScoreB(scoreB);
        displaySumHealthyFoodB(sumHealthyFoodB);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Lose 30 minutes for Junky food for player B, lose 30 minutes for summary Healthy.
     */
    protected void lose30HealthyB(View view) {
        scoreB = (scoreB - 30);
        sumHealthyFoodB = (sumHealthyFoodB - 30);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA < scoreB) {
                whoWinB = "Nooo :-(";
                whoWinA = "Step on!";
            }
        }
        displayScoreB(scoreB);
        displaySumHealthyFoodB(sumHealthyFoodB);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Add 30 for New skills for player B and 30 to summary Bonus.
     */
    protected void add30SkillsB(View view) {
        scoreB = (scoreB + 30);
        sumBonusB = (sumBonusB + 30);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA < scoreB) {
                whoWinB = "Great work";
                whoWinA = "Step on!";
            }
        }
        displayScoreB(scoreB);
        displaySumBonusB(sumBonusB);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Add 30 for Goodnes for player B and 30 to summary Bonus.
     */
    protected void add30GoodB(View view) {
        scoreB = (scoreB + 30);
        sumBonusB = (sumBonusB + 30);

        if (scoreA == scoreB) {
            whoWinA = "draw";
            whoWinB = "draw";
        } else {
            if (scoreA < scoreB) {
                whoWinB = "Amazing!";
                whoWinA = "Step on!";
            }
        }
        displayScoreB(scoreB);
        displaySumBonusB(sumBonusB);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Reset the score for both players back to 0.
     */
    public void startNewDay(View view) {
        scoreA = 0;
        scoreB = 0;
        sumNoActivityA = 0;
        sumNoActivityB = 0;
        sumActiveMinutesA = 0;
        sumActiveMinutesB = 0;
        sumHealthyFoodA = 0;
        sumHealthyFoodB = 0;
        sumBonusA = 0;
        sumBonusB = 0;
        whoWinA = "";
        whoWinB = "";

        displayScoreA(scoreA);
        displayScoreB(scoreB);
        displaySumNoActivityA(sumNoActivityA);
        displaySumNoActivityB(sumNoActivityB);
        displaySumActiveMinutesA(sumActiveMinutesA);
        displaySumActiveMinutesB(sumActiveMinutesB);
        displaySumHealthyFoodA(sumHealthyFoodA);
        displaySumHealthyFoodB(sumHealthyFoodB);
        displaySumBonusA(sumBonusA);
        displaySumBonusB(sumBonusB);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }

    /**
     * Displays the given score for Player B.
     */
    public void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays summary number of activities for Player B.
     */
    public void displaySumNoActivityB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sumNoActivityB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of activities minutes for Player B.
     */
    public void displaySumActiveMinutesB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sumActiveMinutesB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays summary healthy food points for Player B.
     */
    public void displaySumHealthyFoodB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sumHealthyFoodB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays summary of bonus for Player B.
     */
    public void displaySumBonusB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.sumBonusB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays who has higher score.
     */

    public void displayWhoWinA(String score) {
        TextView scoreView = (TextView) findViewById(R.id.whoWinA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayWhoWinB(String score) {
        TextView scoreView = (TextView) findViewById(R.id.whoWinB);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Hide soft keyboard after click outside EditText
     */

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            View v = getCurrentFocus();
            if (v instanceof EditText) {
                Rect outRect = new Rect();
                v.getGlobalVisibleRect(outRect);
                if (!outRect.contains((int) event.getRawX(), (int) event.getRawY())) {
                    v.clearFocus();
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        }
        return super.dispatchTouchEvent(event);
    }

    /**
     * This method saves data to be available when the device is rotating
     */

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreA", scoreA);
        outState.putInt("scoreB", scoreB);
        outState.putInt("sumNoActivityA", sumNoActivityA);
        outState.putInt("sumActiveMinutesA", sumActiveMinutesA);
        outState.putInt("sumHealthyFoodA", sumHealthyFoodA);
        outState.putInt("sumBonusA", sumBonusA);
        outState.putInt("sumNoActivityB", sumNoActivityB);
        outState.putInt("sumActiveMinutesB", sumActiveMinutesB);
        outState.putInt("sumHealthyFoodB", sumHealthyFoodB);
        outState.putInt("sumBonusB", sumBonusB);
        outState.putString("whoWinA", whoWinA);
        outState.putString("whoWinB", whoWinB);
    }
    /**this method will restore all the data saves in the previous method, when rotating the device*/
    /**
     * for this to work you need to give every item that you want to be saves when rotating the device - a specific id on the xml file
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreA = savedInstanceState.getInt("scoreA");
        scoreB = savedInstanceState.getInt("scoreB");
        sumNoActivityA = savedInstanceState.getInt("sumNoActivityA");
        sumNoActivityB = savedInstanceState.getInt("sumNoActivityB");
        sumActiveMinutesA = savedInstanceState.getInt("sumActiveMinutesA");
        sumActiveMinutesB = savedInstanceState.getInt("sumActiveMinutesB");
        sumHealthyFoodA = savedInstanceState.getInt("sumHealthyFoodA");
        sumHealthyFoodB = savedInstanceState.getInt("sumHealthyFoodB");
        sumBonusA = savedInstanceState.getInt("sumBonusA");
        sumBonusB = savedInstanceState.getInt("sumBonusB");
        whoWinA = savedInstanceState.getString("whoWinA");
        whoWinB = savedInstanceState.getString("whoWinB");
        displayScoreA(scoreA);
        displayScoreB(scoreB);
        displaySumNoActivityA(sumNoActivityA);
        displaySumNoActivityB(sumNoActivityB);
        displaySumActiveMinutesA(sumActiveMinutesA);
        displaySumActiveMinutesB(sumActiveMinutesB);
        displaySumHealthyFoodA(sumHealthyFoodA);
        displaySumHealthyFoodB(sumHealthyFoodB);
        displaySumBonusA(sumBonusA);
        displaySumBonusB(sumBonusB);
        displayWhoWinA(whoWinA);
        displayWhoWinB(whoWinB);
    }
}