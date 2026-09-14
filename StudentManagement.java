// Project 1 Student record Mangagement System :

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
   String studid;
   String name;
   String rollno;
   String branch;
   double cgpa;
   
    public StudentManagement(String studid,String name,String rollno,String branch,double cgpa){
      this.studid = studid;
      this.name = name;
      this.rollno = rollno;
      this.branch = branch;
      this.cgpa = cgpa;
    }
    public void displayStudent() {
        System.out.printf("%-10s %-20s %-15s %-15s %-5.2f%n",
                studid,
                name,
                rollno,
                branch,
                cgpa);
    }
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    ArrayList<StudentManagement> studentList = new ArrayList<>();
    
    System.out.println("How many Students data you want to enter ? :");
    int TotalStudents = sc.nextInt();
    sc.nextLine();

    for(int i=1;i<=TotalStudents;i++){
       System.out.println("\nEnter Student "+ i +" "+ "details :");
    
    System.out.println("Enter student id :");
    String studid = sc.nextLine();

    System.out.println("Enter your name :");
    String name = sc.nextLine();
    
   while(studid.equals(name)){
    System.out.println("ERROR! Student ID and Name cannot be Same !");
    System.out.println("Enter a valid name again :");
    name = sc.nextLine();
   }

    System.out.println("Enter your Roll no :");
    String rollno = sc.nextLine();

    System.out.println("Enter your branch :");
    String branch = sc.nextLine();

    double cgpa;

    while (true) {
                System.out.print("Enter CGPA (0-10): ");
                cgpa = sc.nextDouble();

                if (cgpa >= 0 && cgpa <= 10)
                    break;

                System.out.println("Invalid CGPA! Please enter between 0 and 10.");
            }

            sc.nextLine();


    studentList.add(new StudentManagement(studid, name, rollno, branch, cgpa));
  }
  System.out.println("\n========================== STUDENT RECORD ========================");

        System.out.printf("%-10s %-20s %-15s %-15s %-5s%n",
                "ID", "NAME", "ROLL NO", "BRANCH", "CGPA");

        System.out.println("---------------------------------------------------------------------");

        for (StudentManagement s : studentList) {
            s.displayStudent();
        }

        System.out.println("---------------------------------------------------------------------");

        sc.close();
    }
}