package com.example.androidfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment{
    // we need constructor because when user change orientation of device
    // where this helps else application could crash.
    public MainFragment() { }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        /*
        * @params inflater:- will fetch any layout which we create separately in our layout.
        * @params container:- is the view where we'll put out inflate view. aka fragment layout
        * @params savedInstanceState will give us all the state of our activity or fragment.
        * */

        View view = inflater.inflate(R.layout.my_fragment, container, false);
        return view;

        // return super.onCreateView(inflater, container, savedInstanceState);
    }
}
