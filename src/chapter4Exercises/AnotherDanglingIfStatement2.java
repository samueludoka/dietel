package chapter4Exercises;

public class AnotherDanglingIfStatement2 {
    public static void main(String[] args) {
        int y = 0;
        int x = 0;
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            }
            else{
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        }

        if (y == 8) {
            if (x == 5) {
                System.out.println("#####");
            }
            else{
                System.out.println("@@@@@");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        }


        if (y < 8) {
            if (x > 5) {
                System.out.println("#####");
            }
            else{
                System.out.println("@@@@@");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        }
    }
}