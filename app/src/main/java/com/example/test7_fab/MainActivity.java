package com.example.test7_fab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    //Declare all variables
    //Link the elements to the JAVA files
    //onclickListener button for adding and subtracting

    TextView textView;
    int counter = 0;

   FloatingActionButton floatMinus, floatPlus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Linking
        textView = (TextView) findViewById(R.id.counter);
        floatMinus = (FloatingActionButton) findViewById(R.id.buttonMinus);
        floatPlus = (FloatingActionButton) findViewById(R.id.buttonPlus);

        floatPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
             textView.setText(Integer.toString(counter));
                Snackbar.make(view,"Counter Added",Snackbar.LENGTH_LONG).setAction("Action",null).show();
            }
        });

        floatMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                textView.setText(Integer.toString(counter));
                Snackbar.make(view,"Counter Subtracted",Snackbar.LENGTH_LONG).setAction("Action",null).show();
            }
        });

    }
}