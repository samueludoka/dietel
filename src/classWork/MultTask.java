package classWork;

public class MultTask {
    public static void main(String[] args) {
        multiplication(10,23);
    }
    public static int multiplication(int firstNumber,int secondNumber) {
        int result = 0;
        for (int count =secondNumber;count >= firstNumber; count++) {

        result -= firstNumber;
        if(firstNumber == 1){
            result = secondNumber;
        } else if (secondNumber == 1) {
            result = firstNumber;

        }


        }


                

        System.out.println(result);
        return result;


        }

    }

