package day13_breakout;

import java.util.ArrayList;

public class Student 
{
    private String firstName;
    private String lastName;
    private String studentID;
    private String email;
    private ArrayList<String> courses;

    // Constructor
    public Student(String firstName, String lastName, String studentID, String email, ArrayList<String> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.email = email;
        this.courses = courses;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Courses: " + String.join(", ", courses));
        System.out.println("-----------------------------------");
    }
}
