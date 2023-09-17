package ChibuzosAssignment;

public class TestDriller {
    public static void main(String[] args) {
        Driller(1200,356);
    }

    public static int Driller(int amountPerCopy,int numberOfCopy) {
        int result = 0;
        if(numberOfCopy >=1 && numberOfCopy <=4){
            result = amountPerCopy;
            System.out.println(result);
        }
        else if (numberOfCopy >=5 && numberOfCopy <= 9) {
            result = amountPerCopy;
            System.out.println(result);
        }
        else if (numberOfCopy >=10 && numberOfCopy <= 29) {
            result = amountPerCopy;
            System.out.println(result);
        }
        else if (numberOfCopy >=30 && numberOfCopy <= 49) {
            result = amountPerCopy;
            System.out.println(result);
        }
        else if (numberOfCopy >=50 && numberOfCopy <= 90) {
            result = amountPerCopy;
            System.out.println(result);
        }
        else if (numberOfCopy >=100 && numberOfCopy <= 199) {
            result = amountPerCopy;
            System.out.println(result);
        }
        else if (numberOfCopy >=200 && numberOfCopy <=499) {
            result = amountPerCopy;
            System.out.println(result);
        } else if (numberOfCopy > 500) {
            result = amountPerCopy;
            System.out.println(result);
        }
        return result;

    }
}
