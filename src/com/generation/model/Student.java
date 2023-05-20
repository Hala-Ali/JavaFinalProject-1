package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation {
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student(String id, String name, String email, Date birthDate) {
        super(id, name, email, birthDate);
    }

    public void enrollToCourse(Course course) {
        //TODO implement this method
        // Check if student is enrolled course
        // if its true return student is enrolled
        //pass methode to isAttendingCourse
        //add course to course list if student not enrolled yet
        // add course argument to cources instant field
        // else if print out student already enrolled
        //else course is not found
        if (!isAttendingCourse(course.getCode())) {
            courses.add(course);
        }
    }

    public void registerApprovedCourse(Course course) {
        approvedCourses.put(course.getCode(), course);
    }


    public boolean isAttendingCourse(String courseCode) {
        //TODO implement this method
        //boolean isAttendingCourse = false;
        for (Course course : courses) {
            if (course.getCode().equals(courseCode)) {
                System.out.println("Student already enrolled in course " + courseCode + "!");
                return true;
            }
        }
        return false;

    }

    @Override
    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student {" + super.toString() + ", " + courses + "}";
    }
}