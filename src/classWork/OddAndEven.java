import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();


       if (num%2 == 0 ) {
           System.out.printf("%d is an even number",num);
       }else{
           System.out.printf("%d is an odd number",num);
       }


    }
}
