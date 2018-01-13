package com.example.umang.intents;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

/**
 * Created by umang on 10-09-2016.
 */
public class NewActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        final String layout = "Layout called";
        Log.d(layout, "Activity Called");
        setContentView(R.layout.activity_main);
    }
}
