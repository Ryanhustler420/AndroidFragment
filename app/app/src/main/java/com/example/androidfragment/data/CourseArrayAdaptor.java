package com.example.androidfragment.data;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidfragment.R;

import java.util.List;

public class CourseArrayAdaptor extends ArrayAdapter<Course> {
    private Context context;
    private List<Course> courses;

    public CourseArrayAdaptor(@NonNull Context context, int resource, List<Course> courses) {
        super(context, resource, courses);
        this.context = context;
        this.courses = courses;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // return super.getView(position, convertView, parent);
        Course course = courses.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.course_list_item, null);

        ImageView courseImageView = view.findViewById(R.id.courseImageId);
        // this.getContext() could change to context
        courseImageView.setImageResource(course.getImageResourceId(this.getContext()));

        TextView courseName = view.findViewById(R.id.courseName);
        courseName.setText(course.getCourseName());

        return view;
    }
}
