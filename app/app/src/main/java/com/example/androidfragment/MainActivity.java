package com.example.androidfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.androidfragment.data.Course;

public class MainActivity extends AppCompatActivity implements CourseListFragment.Callbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemSelected(Course course) {
        Toast.makeText(getApplicationContext(), course.getCourseName(), Toast.LENGTH_LONG).show();
    }
}
