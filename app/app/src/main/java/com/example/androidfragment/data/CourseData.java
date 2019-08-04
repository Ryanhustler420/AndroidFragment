package com.example.androidfragment.data;

import java.util.ArrayList;

public class CourseData {
    /*
    * This is just a server. which has all the data's
    */
    private String[] courseNames = {"First Course", "Second Course", "Third Course", "Fourth Course", "Fifth Course", "Sixth Course", "Ceven Course"};

    public ArrayList<Course> courseList () {
     ArrayList<Course> list = new ArrayList<>();
         for(String c: courseNames) {
             Course course = new Course(c, "landscape");
             list.add(course);
         }
         return list;
    }
}
