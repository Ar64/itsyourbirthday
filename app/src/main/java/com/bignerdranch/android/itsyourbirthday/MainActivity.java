package com.bignerdranch.android.itsyourbirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView text_choose;
    Button button_topLeft;
    Button button_topRight;
    Button button_bottomLeft;
    Button button_bottomRight;
    Button button_back;
    ArrayList<String> answersArrayList;
    //ArrayList<String> characterArrayList;
    //ArrayList<String> cakeArrayList;
    int timesTapped = 0;

    public void chooseAnswer(View view) {

        Button button_pressed = (Button) view;

        answersArrayList.add(button_pressed.getText().toString());

        Toast.makeText(getApplicationContext(),answersArrayList.get(timesTapped), Toast.LENGTH_LONG).show();

        text_choose.setText("Choose your birthday cake!");
        button_topLeft.setText("Sheet Cake");
        button_topRight.setText("Layered Cake");
        button_bottomLeft.setText("Cupcake Cake");
        button_bottomRight.setText("Ice cream Cake");

        button_back.setVisibility(View.VISIBLE);

        timesTapped++;
        Log.i("Info", Integer.toString(answersArrayList.size()));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_choose = findViewById(R.id.text_choose);
        button_topLeft = findViewById(R.id.button_topLeft);
        button_topRight = findViewById(R.id.button_topRight);
        button_bottomLeft = findViewById(R.id.button_bottomLeft);
        button_bottomRight = findViewById(R.id.button_bottomRight);
        button_back = findViewById(R.id.button_back);
        button_back.setVisibility(View.GONE);
        answersArrayList = new ArrayList<>();
        /*
        characterArrayList = new ArrayList<>();
        cakeArrayList = new ArrayList<>();

        characterArrayList.add("Girl with long hair");
        characterArrayList.add("Boy with long hair");
        characterArrayList.add("Girl with short hair");
        characterArrayList.add("Boy with short hair");

        cakeArrayList.add("Sheet cake");
        cakeArrayList.add("Layered cake");
        cakeArrayList.add("Cupcake cake");
        cakeArrayList.add("Ice cream cake");
        */

    }
}
