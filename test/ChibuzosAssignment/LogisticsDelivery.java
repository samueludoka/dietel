package ChibuzosAssignment;

public class LogisticsDelivery {
    public static void main(String[] args) {
        Logistics(60,5000);

    }
    public static int Logistics(int numberOfDelivery, int basePay){
        int result = 0;
        if(numberOfDelivery < 50) {
            result = numberOfDelivery * 160 + basePay;
            System.out.println(result);
        }
        else if (numberOfDelivery >= 50 && numberOfDelivery <= 59) {
            result = numberOfDelivery * 200 + basePay;
            System.out.println(result);
        }
        else if (numberOfDelivery >= 60 && numberOfDelivery <= 69){
            result = numberOfDelivery * 250 + basePay;
            System.out.println(result);
        }
        else if (numberOfDelivery >= 70){
            result = numberOfDelivery * 500 + basePay;
            System.out.println(result);
        }

        return result;
    }

}



