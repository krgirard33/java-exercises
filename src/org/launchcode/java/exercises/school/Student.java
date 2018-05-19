package org.launchcode.java.exercises.school;

public class Student {
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public String getName() {
        return name;
    }
    public void setName(String aName) {
        name = aName;
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
