package com.example.umang.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment {
    @Nullable
    private static TextView topText;
    private static TextView bottomText;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_section_segment, container, false);
        topText = (TextView)view.findViewById(R.id.topMemeText);
        bottomText = (TextView)view.findViewById(R.id.bottomMemeText);
        return view;
    }
    public void setMeme(String top, String bottom){
        topText.setText(top);
        bottomText.setText(bottom);
    }
}
