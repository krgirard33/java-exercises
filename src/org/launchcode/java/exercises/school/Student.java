package org.launchcode.java.exercises.school;

public class Student {
    private static int nextStudentId = 1;
    private String studentName;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String aStudentName, int aStudentId, int aNumberOfCredits, double aGpa) {
        this.studentName = aStudentName;
        this.studentId = aStudentId;
        this.numberOfCredits = aNumberOfCredits;
        this.gpa = aGpa;
    }

    public Student(String aStudentName, int aStudentId) {
        this(aStudentName, aStudentId, 0, 0);
    }

    public Student(String aStudentName) {
        this(aStudentName, nextStudentId);
        nextStudentId++;
    }

    // Getters & Setters
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String aStudentName) {
        studentName = aStudentName;
    }

    public int getStudentId() {
        return studentId;
    }

    /* private void setStudentId(int aStudentId) {
        studentId = aStudentId;
    } */


    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public void addGrade(int courseCredits, double grade) {
        double oldGrade = gpa * numberOfCredits;
        double newGrade = grade * courseCredits;
        numberOfCredits = numberOfCredits + courseCredits;
        gpa = (oldGrade + newGrade) / numberOfCredits;
    }

    public String getGradeLevel() {
        String studentGradeLevel;
        if (numberOfCredits >= 90) {
            studentGradeLevel = "senior";
        }
        else if (numberOfCredits >= 60) {
            studentGradeLevel = "junior";
        }
        else if (numberOfCredits >= 30) {
            studentGradeLevel = "sophomore";
        }
        else {
            studentGradeLevel = "freshman";
        }
        return "This student's grade level is " + studentGradeLevel + ".";
    }
    public String toString() {
        return studentName + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass() != getClass()) {
            return false;
        }
        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
    }
}
