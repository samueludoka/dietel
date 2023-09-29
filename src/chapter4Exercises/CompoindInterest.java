package chapter4Exercises;

public class CompoindInterest {
    public static void main(String[] args) {
        double principe = 1000.0;
        double rate = 0.05;
        double amount = 0.;
        System.out.printf("%s%20s%n", "year", "Amount on deposite");

        for (int year = 1; year <= 10 ; year++) {
            amount = principe * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n",year, amount);
            
        }
    }
}
