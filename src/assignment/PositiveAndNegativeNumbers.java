import java.util.Scanner;

public class PositiveAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any range of number and enter 000 to stop the count: ");
        int num = input.nextInt();
        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeros = 0;
        int count = 0;
        for (count=1; num != 000; count++) {
            System.out.println("Enter any range of number and enter 000 to stop the count: ");
            num = input.nextInt();
            if (num > 0){
                System.out.println("positive Numbers");

            }else if(num < 0) {
                System.out.println("Negative Numbers");
            }

            else{
                System.out.println("Equal to zero");
                positiveNumber += count;
                System.out.println(positiveNumber);
                negativeNumber += count;
                System.out.println(negativeNumber);

            }

        }





        }
    }

