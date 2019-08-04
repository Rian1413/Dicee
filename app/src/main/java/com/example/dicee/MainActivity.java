package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = findViewById(R.id.RollButton);
        final ImageView leftDice;
        leftDice = findViewById(R.id.Dice_2);
        final ImageView rightDice;
        rightDice = findViewById(R.id.Dice_1);


        final int[] array = {R.drawable.dice1 ,
                        R.drawable.dice2,
                        R.drawable.dice3 ,
                         R.drawable.dice4,
                          R.drawable.dice5 ,
                         R.drawable.dice6};




        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomNumGenerator = new Random();
                int diceNum1 = randomNumGenerator.nextInt(6);
                int diceNum2 = randomNumGenerator.nextInt(6);
                Log.d("Dicee" , "Rayan  " + diceNum1 + diceNum2);


                leftDice.setImageResource(array[diceNum1]);
                rightDice.setImageResource(array[diceNum2]);


            }
        });

    }
}
