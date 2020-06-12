package StudentDataBaseApp;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOFCourse = 800;
    private static int id = 100;

    //constructor: prompt year and name
    public Student (){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter students first name:");
        this.firstName = in.nextLine();

        System.out.println("Enter students last name:");
        this.lastName = in.nextLine();

        System.out.println(" 1 - freshman\n 2 - for 2 course\n 3 - Junior\n 4 - Senior\n Enter students class level ");
        this.gradeYear = in.nextInt();

        setStudentID();

    }

    // generate id
    private void setStudentID(){
        //grade level + id
        id++;
        this.studentID = gradeYear + "" + id;
    }


    //Enroll courses
    public void enroll(){
        //get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (0 to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOFCourse;
            } else {
                break;
            }
        }while (1 != 0);
    }

    //view balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Tank you for your payment");
        viewBalance();
    }



    //Show status
    public String toString(){
        return "Name: " + firstName + " " + lastName +
                "\n Grader level: " + gradeYear +
                    "\n Student ID: " + studentID +
                        "\n Enrolled courses: " + courses +
                            "\n Balance: $" + tuitionBalance;
    }


}
