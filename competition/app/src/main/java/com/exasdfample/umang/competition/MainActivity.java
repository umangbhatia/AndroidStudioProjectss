package com.exasdfample.umang.competition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText m;
    EditText p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.log);
        m = (EditText) findViewById(R.id.mail);
        p = (EditText) findViewById(R.id.pass);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String pass1 ="pass";
                String mail1 ="admin";
                String mail = m.getText().toString();
               String pass = p.getText().toString();
                if(mail.contentEquals(mail1)&&pass.contentEquals(pass1)){
                    Intent i = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(),"Wrong mail or password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
