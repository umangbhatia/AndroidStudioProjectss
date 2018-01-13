package com.example.umang.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click = (Button)findViewById(R.id.ClickButton);
        click.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView text = (TextView)findViewById(R.id.textView2);
                        text.setText("Good Job!");
                    }

                }
        );
        click.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    @Override
                    public boolean onLongClick(View view) {
                        TextView text = (TextView)findViewById(R.id.textView2);
                        text.setText("Long Click!");
                        return false;
                    }


                }
        );

    }
}
