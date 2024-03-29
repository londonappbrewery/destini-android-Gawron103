package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button mButtonTop = null;
    private Button mButtonDown = null;
    private TextView mStoryTextView = null;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mButtonTop = (Button)findViewById(R.id.buttonTop);
        mButtonDown = (Button)findViewById(R.id.buttonBottom);
        mStoryTextView = (TextView)findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonDown.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
                else if (mStoryIndex == 3) {
                    mStoryTextView.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonDown.setVisibility(View.GONE);

                    Toast.makeText(getApplicationContext(), "You survived", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    mStoryTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonDown.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }
                else if (mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonDown.setVisibility(View.GONE);
                }
                else if (mStoryIndex == 3) {
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonDown.setVisibility(View.GONE);
                }
            }
        });

    }
}
