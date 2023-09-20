package classWork;

public class MultTask {
    public static void main(String[] args) {
        multiplication(10, 23);
    }

    public static int multiplication(int firstNumber, int secondNumber) {
        int result = 0;
        if (secondNumber > 0) {
            for (int count = 1; count <= secondNumber; count++) {
                result += firstNumber;
            }

        }
        else if (secondNumber < 0) {
            for (int count = 1; count <= firstNumber; count++) {
                result += secondNumber;
            }


        }
        if(firstNumber < 0 && secondNumber < 0){
            for(int count = 1;count <= -secondNumber;count++){
                result = result +(-firstNumber);
            }
        }
        return result;


    }
}

