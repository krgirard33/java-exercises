package org.launchcode.java.exercises.school;

public class Student {
    private String studentName;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String aStudentName) {
        studentName = aStudentName;
    }

    public int getStudentId() {
        return studentId;
    }
    private void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double gpa() {
        return gpa;
    }
    public void setGpa(double aGpa) {
        gpa = aGpa;
    }
}
