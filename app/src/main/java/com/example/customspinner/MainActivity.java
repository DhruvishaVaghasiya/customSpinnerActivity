package com.example.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String[] countryNames={"India","Japan","Iran","Italy","Canada","NewYork"};
    int[] imgflags={R.drawable.india,R.drawable.japan,R.drawable.iran,R.drawable.italy,R.drawable.canada,R.drawable.newyork};
    Spinner simpleSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleSpinner=findViewById(R.id.simpleSpinner);
        CustomAdapter customAdapter=new CustomAdapter(this,countryNames,imgflags);
        simpleSpinner.setAdapter(customAdapter);


    }
}