package com.example.myapplication.Activities;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.example.myapplication.R;

import java.sql.Connection;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button convert = (Button)findViewById(R.id.convert);
        Button exit = (Button)findViewById(R.id.exit);
        EditText mm = (EditText)findViewById(R.id.mm);
        EditText inches = (EditText)findViewById(R.id.inches);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                convertmm();


            }

            private void convertmm() {
                int millimetere = Integer.parseInt(mm.getText().toString());
                Double in = millimetere/24.5;

                inches.setText(Double.toString(in));
            }
        });
    }


}
