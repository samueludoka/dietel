package chapter7Assignment;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("kindly enter your credit card number: ");
        String cardNumber = input.nextLine();
        System.out.println("******************************************");
        System.out.println("credit card number is ** " + cardNumber);

        int cardlength = cardNumber.length();
        int evenSum = 0, oddSum = 0, sum;
        if (cardNumber.length() < 13 || cardNumber.length() > 19) {
            System.out.println("card digit length is invalid");
        }else{
            System.out.println("card digit length is *** " + cardNumber.length());
        }
        for (int count = cardlength - 1; count >= 0; count--) {
//            System.out.println(cardNumber.charAt(count));
            int digit = Character.getNumericValue(cardNumber.charAt(count));
            if (count % 2 == 0) {
                int multiplyByTwo = digit * 2;
                if (multiplyByTwo > 9) {
                    String mul = String.valueOf(multiplyByTwo);
                    multiplyByTwo = Character.getNumericValue(mul.charAt(0)) + Character.getNumericValue(mul.charAt(1));
                }
                evenSum += multiplyByTwo;
            } else {
                oddSum += digit;
            }
        }
        sum = evenSum + oddSum;

        if (sum % 10 == 0) {
            System.out.println("credit card validity status: valid");
        } else {
            System.out.println("credit card validity status: invalid");
        }
        System.out.println("******************************************");

//        if(cardNumber.length() == 4)

    }



}

