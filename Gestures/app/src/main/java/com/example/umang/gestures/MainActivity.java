package com.example.umang.gestures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.support.v4.view.GestureDetectorCompat;


public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private TextView message;
    private GestureDetectorCompat gesture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = (TextView)findViewById(R.id.Message);
        this.gesture = new GestureDetectorCompat(this, this);
        gesture.setOnDoubleTapListener(this);
    }


    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        message.setText("Single Tap");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        message.setText("Double Tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        message.setText("Double Tap Event");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        message.setText("Down");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

        message.setText("ShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        message.setText("Single Tap Up");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        message.setText("Scroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        message.setText("LongPress");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        message.setText("Fling");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gesture.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
