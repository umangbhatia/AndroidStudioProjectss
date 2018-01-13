package com.exasdfample.umang.competition;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by umang on 11-09-2016.
 */
public class Calc extends AppCompatActivity {
    Button b;
    TextView tv;
    EditText et1,et2;

    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
//        b1=(Button) findViewById(R.id.button2);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et1 = (EditText) findViewById(R.id.editText);
                EditText et2 = (EditText) findViewById(R.id.editText2);
                TextView tv = (TextView) findViewById(R.id.textView);

                String num1=et1.getText().toString();
                String num2=et2.getText().toString();
                result=Double.parseDouble(num1)+Double.parseDouble(num2);
                tv.setText(Double.toString(result));

            }
        });

    }



}
