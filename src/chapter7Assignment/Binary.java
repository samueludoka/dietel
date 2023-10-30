package chapter7Assignment;

public class Binary {
    public static int binaryToDecimalConversion(String number){
        int decimal = 0;
        String binary = "";
        for (int count = 0; count < binary.length(); count++) {
            char binaryNumber = binary.charAt(count);

            if(binaryNumber == '1'){
                decimal += (int) Math.pow(2, binary.length() -1- count);
            } else if (binaryNumber != '0') {
                return -1;
            }

        }
        return decimal;
    }
}
