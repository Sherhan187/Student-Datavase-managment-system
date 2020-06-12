package StudentDataBaseApp;

import java.util.Scanner;

public class StudentDataBaseApp {

        public static void main(String[] args) {
            // how many students want to add
            System.out.println("How many students we want to add");
            Scanner in = new Scanner(System.in);
            int numOFStudents = in.nextInt();
            Student[] students = new Student[numOFStudents];

            //create num of stud
            for (int i = 0; i < numOFStudents; i++) {
                System.out.println(" ");
                students[i] = new Student();
                students[i].enroll();
                students[i].payTuition();
                if (numOFStudents > 1){
                    System.out.println("\n The next students info");
                }else
                    continue;
            }
            for (int i = 0; i < numOFStudents; i++) {
                System.out.println(students[i].toString());
            }
        }
    }

