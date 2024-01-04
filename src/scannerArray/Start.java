package scannerArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        System.out.print("Insert the number of Students: ");
        int studentNumber = scanner.nextInt();

        for (int i = 0; i < studentNumber; i++){

            System.out.print("Insert the name of the Student: " + (i+1) + ": ");
            String studentName = scanner.next();

            Student student = new Student(studentName);

            System.out.print("Insert the number of schoolSubjects: ");
            int schoolSubjectsNumber = scanner.nextInt();

            for (int j = 0; j < schoolSubjectsNumber; j++){
                System.out.print("Insert the name of schoolSubject " + (j+1) + ": ");
                student.getSchoolSubjects().add(scanner.next());

                System.out.print("Insert the vote for " + student.getSchoolSubjects().get(j) + ": ");
                student.getVotes().add(scanner.nextInt());

                System.out.println("Insert the second vote for " +
                        student.getSchoolSubjects().get(j) + ": ");
                student.getVotes().add(scanner.nextInt());
            }
            studentList.add(student);
        }
        double totaleAvg = 0.0;
        for (Student student : studentList){
            System.out.println("Nome: " + student.getName());

            for (int i=0; i < student.getSchoolSubjects().size(); i++){
                System.out.println(student.getSchoolSubjects().get(i) +
                        ": " + student.getVotes().get(i));
            }
            double studentAvg = student.calculateAvg();
            System.out.println("Average: " + studentAvg);
            System.out.println();

            totaleAvg += studentAvg;
        }

        System.out.println("Media Totale: " + (totaleAvg / studentList.size()));
    }
}
