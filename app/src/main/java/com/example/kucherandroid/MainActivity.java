package com.example.kucherandroid;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView titleTV;
    TextView answersTV;
    LinearLayout buttonsLL;
    Story story;
    Situation situation = Situation.getWindow();
    Button exBut;
    Button startBut;
    TextView pointsTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleTV = findViewById(R.id.titleTV);
        answersTV = findViewById(R.id.answersTV);
        buttonsLL = findViewById(R.id.buttonsLL);
        exBut = findViewById(R.id.ExBut);
        startBut = findViewById(R.id.StartBut);
        pointsTV = findViewById(R.id.PointsTV);
        Character character = new Character("Вася", 1, 100, 50);
        story = new Story(character, situation);
        changeSituation();
        exBut.setOnClickListener((v) -> finish() );
        startBut.setOnClickListener(this::restartStory);

    }

    private void restartStory(View view) {
        story.current = story.start;
        story.character = new Character("Вася", 1, 100, 50);
        changeSituation();
    }
    public void changeSituation() {
        Situation sit = story.current;
        titleTV.setText(sit.getTitle());
        answersTV.setText(sit.getText());
        pointsTV.setText("Career: " + story.character.getK() + "\n" + "Reputation: " + story.character.getR() + "\n" + "Assets: " + story.character.getA());
        buttonsLL.removeAllViews();
        for (int i = 0; i < sit.answers.length; i++) {
            Button button = new Button(this);
            button.setText("" + (i + 1));
            buttonsLL.addView(button);
            final int answer = i + 1;
            button.setOnClickListener(new View.OnClickListener(){
                    public void onClick(View v){
                        story.go(answer);
                        changeSituation();
                    }
            });

        }
        if (sit.answers.length == 0) {
            Button f = new Button(this);
            f.setText("END");
            f.setOnClickListener((v) -> finish());
            buttonsLL.addView(f);
        }
    }
}