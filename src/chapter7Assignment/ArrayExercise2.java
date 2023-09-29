package chapter7Assignment;

public class ArrayExercise2 {
     public static void main(String[] args) {
        char [][] matrix = new char [3][3];
        matrix [0][0] = 'x';
        matrix [0][1] = 'o';
        matrix [0][2] = 'x';
        matrix [1][0] = 'x';
        matrix [1][1] = 'x';
        matrix [1][2] = 'o';
        matrix [2][0] = '0';
        matrix [2][1] = 'x';
        matrix [2][2] = 'x';

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" |\t");
                
            }
            System.out.println(" ");
        }
        
    }
}
