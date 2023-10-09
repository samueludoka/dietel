package chapter7Assignment;

public class CreditCard1 {

    public static String[] creditCardNumber(String[] cardNumber) {
        cardNumber = new String[cardNumber.length];
        String[] cardNumberValue = null;
        
        for (int count = 0; count < cardNumber.length; count++) {
            if (cardNumber.length < 13 || cardNumber.length > 19) {
                System.out.println("invalid cardNumber");
            } else {
                cardNumberValue = new String[cardNumber.length];
            }
            
        }
        return cardNumberValue;
    }
    public static boolean cardValidate(String[] cardNumber){
        cardNumber = new String[cardNumber.length];
        int evenSum = 0, oddSum = 0, sum = 0;
        int digit = 0;

        for (int count = cardNumber.length -1; count >= 0; count--) {
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
        boolean Sum = true;



        return (sum % 10 == 0);
    }
}


   