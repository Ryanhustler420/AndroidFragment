package com.example.androidfragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class CourseDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        if (savedInstanceState == null) {

            Bundle extra = getIntent().getExtras();
            int position = extra.getInt("course_id");

            Toast.makeText(getApplicationContext(), "position: " + position, Toast.LENGTH_LONG).show();

            CourseDetailFragment fragment = new CourseDetailFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();

            fragmentManager
                    .beginTransaction()
                    .add(R.id.detailContainer, fragment)
                    .commit();
        }
    }
}
