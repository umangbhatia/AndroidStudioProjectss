package com.example.umang.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.EditText;
import android.widget.Button;


public class Top_Section_Fragment extends Fragment {
    @Nullable
    private static EditText topText;
    private static EditText bottomText;

    TopSectionListener activityCommmander;

    public interface TopSectionListener {
         void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommmander = (TopSectionListener) activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_secton_layout, container, false);
        topText = (EditText) view.findViewById(R.id.topTextInput);
        bottomText = (EditText)view.findViewById(R.id.bottomTextInput);
        final Button button = (Button) view.findViewById(R.id.button);



        button.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        buttonClicked(view);
                    }

                }
        );
        return view;
    }
    public void buttonClicked(View view){
        activityCommmander.createMeme(topText.getText().toString(), bottomText.getText().toString());

    }

}
