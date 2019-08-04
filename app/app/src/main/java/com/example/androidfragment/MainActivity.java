package com.example.androidfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // programmatically creating fragment and inject to main_activity XML layout
        FragmentManager fragmentManager = getSupportFragmentManager();
        // Getting The Fragment Where we wanna inject our fragment.
        Fragment fragment = fragmentManager.findFragmentById(R.id.my_container);

        if(fragment == null) {
            // this new CourseListFragment() is our created Class. see class for more detail. it has the override method
            fragment = new CourseListFragment();
            fragmentManager.beginTransaction().add(R.id.my_container, fragment)
            .commit();
        }
    }
}
