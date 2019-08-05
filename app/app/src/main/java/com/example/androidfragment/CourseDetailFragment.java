package com.example.androidfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidfragment.data.Course;

public class CourseDetailFragment extends Fragment {
    Course course;

    // Require no-args constructor
    public CourseDetailFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.course_detail_fragment, container, false);

        if(course != null) {
            TextView courseName = view.findViewById(R.id.detailCourseName);
            courseName.setText(course.getCourseName());

            ImageView courseImage = view.findViewById(R.id.detailCourseImage);
            courseImage.setImageResource(course.getImageResourceId(getActivity()));

            TextView courseDescription = view.findViewById(R.id.detailCourseDescription);
            courseDescription.setText(course.getCourseName());
        }

        return view;
    }
}
