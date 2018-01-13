package com.exasdfample.umang.camera;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    MediaPlayer song;
    int pause;
    Button b;
    WebView v1;
    Button pl,pa,st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        v1 = (WebView) findViewById(R.id.webView);
        pl = (Button) findViewById(R.id.button2);
        pa = (Button) findViewById(R.id.button3);
        st = (Button) findViewById(R.id.button4);

//        v1.loadUrl("https://www.youtube.com/watch?v=PJjokuaxS1o");
//        b.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivity(i);
//
//            }
//        });
    }
    public void Play(View v){
        if(song==null){
           song=MediaPlayer.create(this,R.raw.dum);
            song.start();
            Toast.makeText(getApplicationContext(),"Play",Toast.LENGTH_SHORT).show();
        }
        else if(!song.isPlaying()){
            song.seekTo(pause);
            song.start();
            Toast.makeText(getApplicationContext(),"Play",Toast.LENGTH_SHORT).show();
        }
    }

    public void Pause(View v){
        if(song!=null){
            song.pause();
            pause=song.getCurrentPosition();
            Toast.makeText(getApplicationContext(),"Pause",Toast.LENGTH_SHORT).show();
        }
    }
    public void Stop(View v){
        song.stop();
        song=null;
        Toast.makeText(getApplicationContext(),"Stop",Toast.LENGTH_SHORT).show();
    }
}