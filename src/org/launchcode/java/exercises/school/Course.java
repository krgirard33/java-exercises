package org.launchcode.java.exercises.school;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private int courseId;
    private String courseName;
    private String courseDescription;
    private String courseMajor; // Something like "CPT" for computer courses
    private int courseCode; // Something like "135" so we know complexity
    private double courseCredits; // 3.0 credit hours
    private ArrayList<Student> roster = new ArrayList<>();

    public Course(int aCourseId, String aCourseName, String aCourseDescription, String aCourseMajor,
                  int aCourseCode, double aCourseCredits, ArrayList<Student> newRoster) {
        this.courseId = aCourseId;
        this.courseName = aCourseName;
        this.courseDescription = aCourseDescription;
        this.courseMajor = aCourseMajor;
        this.courseCode = aCourseCode;
        this.courseCredits = aCourseCredits;
        this.roster = newRoster;
    }

    // Getters & Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName () {
        this.courseName = courseName;
    }
    public String getCourseMajor() {
        return courseMajor;
    }

    public void setCourseMajor(String courseMajor) {
        this.courseMajor = courseMajor;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public double getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(double courseCredits) {
        this.courseCredits = courseCredits;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }

    public String toString() {
        return courseMajor + " " + courseCode + " " + courseName + " (" + courseCredits + ") \n Description"
                + courseDescription;
    }

}
