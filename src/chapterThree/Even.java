package chapterThree;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

      if(num %5 == 0 && num != 0 ){
          System.out.println("factor");
      }else{
          System.out.println("not a factor");
      }
    }
}
