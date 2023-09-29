package chapter4Exercises;

public class AnotherDanglingIfStatement {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        if (x < 10) {
            if (x > 10) {
                System.out.println("*****");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
            }
        }
        if (x < 10) {
        if (y > 10);
        System.out.println("*****");
        }
        else{
            System.out.println("#####");
            System.out.println("$$$$$");

        }
    }
}
