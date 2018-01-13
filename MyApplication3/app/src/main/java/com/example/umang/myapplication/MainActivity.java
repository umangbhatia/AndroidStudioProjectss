package com.example.umang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view){
        display(1);
    }

    private void display(int i) {
        TextView qtydisplay = (TextView)findViewById(R.id.qtydisplayed);
        qtydisplay.setText(""+i);
    }
}
