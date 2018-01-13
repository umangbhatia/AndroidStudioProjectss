package com.exasdfample.umang.random;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by umang on 11-09-2016.
 */
public class NewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newact);
        Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_SHORT).show();
    }
}
