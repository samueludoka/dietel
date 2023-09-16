package Assignment;

public class Table {
    public static void main(String[] args) {

        int number = 1;
        int numberTwo = 2;
        int numberThree = 3;
        int numberFour = 4;
        int numberFive = 5;
        int power = 2;
        int powerTwo = 3;
        int powerThree = 4;
        int powerFour = 5;
        int powerFive = 6;
        int result = 1;
        int resultTwo = 1;
        int resultThree = 1;
        int resultfour = 1;
        int resultFive = 1;
        System.out.println("a\t\tb\t\tpow(a,b)");
        for (int count = 1; count <= 2; count++) {
            result = result * number;

        }
        System.out.printf("\n%d\t\t%d\t\t%d", number, power, result);

        for (int count = 1; count <= 3; count++) {
            resultTwo = resultTwo * numberTwo;
        }
        System.out.printf("\n%d\t\t%d\t\t%d", numberTwo, powerTwo, resultTwo);

        for (int count = 1; count <= 4; count++) {
            resultThree = resultThree * numberThree;
        }
        System.out.printf("\n%d\t\t%d\t\t%d", numberThree, powerThree, resultThree);

        for (int count = 1; count <= 5; count++) {
            resultfour = resultfour * numberFour;
        }
        System.out.printf("\n%d\t\t%d\t\t%d", numberFour, powerFour, resultfour);

        for (int count = 1; count <= 6; count++) {
            resultFive = resultFive * numberFive;
        }
        System.out.printf("\n%d\t\t%d\t\t%d", numberFive, powerFive, resultFive);


    }
}