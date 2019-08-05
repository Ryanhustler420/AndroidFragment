package com.example.androidfragment;

import android.content.Intent;
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
    public void onItemSelected(Course course, int position) {
        Toast.makeText(getApplicationContext(), course.getCourseName(), Toast.LENGTH_LONG).show();

        Intent intent = new Intent(MainActivity.this, CourseDetailActivity.class);
        intent.putExtra("course_id", position);
        startActivity(intent);
    }
}
