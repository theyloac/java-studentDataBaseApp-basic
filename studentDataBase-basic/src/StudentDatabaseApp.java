import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Student stu1 = new Student();

        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.toString());

        // Ask how many new students we want to add
        System.out.println("How many students do you want to add?");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
        
        // Create n number of new students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }
    }
    
}
