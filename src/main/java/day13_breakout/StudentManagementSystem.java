package day13_breakout;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("How many students do you want to store? ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Input student information
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter information for Student " + (i + 1));

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Student ID: ");
            String studentID = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("How many courses is this student enrolled in? ");
            
            int numCourses = scanner.nextInt();
            
            scanner.nextLine(); // consume newline

            ArrayList<String> courses = new ArrayList<>();
            for (int j = 0; j < numCourses; j++) 
            {
                System.out.print("Enter course " + (j + 1) + ": ");
                String course = scanner.nextLine();
                courses.add(course);
            }

            // Create Student object and add to list
            Student student = new Student(firstName, lastName, studentID, email, courses);
            
            students.add(student);
        }

        // Menu
        while (true) 
        {
            System.out.println("\n---- Student Management Menu ----");
            System.out.println("1. Display All Students");
            System.out.println("2. Find Student by Student ID");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("\n---- All Students ----");
                    for (Student student : students) 
                    {
                        student.displayStudentInfo();
                    }
                    break;

                case 2:
                    System.out.print("Enter Student ID to search: ");
                    String searchID = scanner.nextLine();
                    boolean found = false;
                    for (Student student : students) 
                    {
                        if (student.getStudentID().equalsIgnoreCase(searchID)) 
                        {
                            System.out.println("\n---- Student Found ----");
                            student.displayStudentInfo();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with ID " + searchID + " not found.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
