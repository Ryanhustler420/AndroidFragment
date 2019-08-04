package com.example.androidfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.androidfragment.data.Course;
import com.example.androidfragment.data.CourseArrayAdaptor;
import com.example.androidfragment.data.CourseData;
import com.example.androidfragment.util.ScreenUtility;

import java.util.List;

public class MainFragment extends ListFragment{
    List<Course> courses = new CourseData().courseList();
    // we need constructor because when user change orientation of device
    // where this helps else application could crash.
    public MainFragment() { }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        ScreenUtility screenUtility = new ScreenUtility(getActivity());

        Toast.makeText(getContext(), String.valueOf(screenUtility.getDpWidth()), Toast.LENGTH_LONG).show();

        super.onCreate(savedInstanceState);
        CourseArrayAdaptor adaptor = new CourseArrayAdaptor(getActivity(), R.layout.course_list_item, courses);
        setListAdapter(adaptor);
    }

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
