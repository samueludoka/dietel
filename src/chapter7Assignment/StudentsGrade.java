package chapter7Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] studentsGrade;

        System.out.println("Enter number of subjects: ");
        int numberOfSubject = input.nextInt();

        System.out.println("Enter number of students");
        int numberOfStudents = input.nextInt();

        studentsGrade= new int[numberOfStudents][numberOfSubject];
        double [] theAverage = new double[numberOfStudents];

        for (int row = 0; row < studentsGrade.length; row++) {
            int total = 0;
            System.out.println("This is for Student" + (row + 1));
            for (int col = 0; col < numberOfSubject; col++) {
                int count = 0;
                while (count == 0) {
                    System.out.println("Enter the student score(1 - 100) for subject" + (col + 1));
                    studentsGrade[row][col] = input.nextInt();
                    if(studentsGrade[row][col] < 100 && studentsGrade[row][col] > 0){
                        count++;
                        total += studentsGrade[row][col];
                        theAverage[row] = (double) total /numberOfSubject;
                    }
                }
            }
        }
        System.out.println("=================================================");
        System.out.print("STUDENT     ");
        for (int i = 0; i < numberOfSubject; i++){
            System.out.print("SUB" + (i+1) + " ");
        }
        System.out.println("TOT  AVE  POS");
        System.out.println("==================================================");
        Arrays.sort(theAverage);

        for (int j = 0; j < numberOfStudents; j++) {
            int total = 0;
            System.out.print("Student "+(j+1) +"    ");
            for (int k = 0; k < numberOfSubject; k++){
                System.out.print(studentsGrade[j][k] +"   ");
                total += studentsGrade[j][k];
            }
            System.out.print(total + "   ");       //prints total
            System.out.print(total/numberOfSubject + "   ");  // prints average
            for(int e = 0; e < numberOfStudents; e++){
                if((double) total / numberOfSubject == theAverage [e]){
                    System.out.println(e+1);
                }
            }
            System.out.println();
        }




    }
}
