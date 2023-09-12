package Assignment;

public class Table {
    public static void main(String[] args) {
        int number = 0;
        number = 1;
        number = 2;
        number = 3;
        number = 4;
        number = 5;
        int power = 0;
        power = 2;
        power = 3;
        power = 4;
        power = 5;
        power = 6;
        int result = 1;
        System.out.println("\t\ta\t\tb\t\tpow(a,b)");
        for (int count = 1; count <= 2; count++) {
            result = result * count;
            System.out.print(result);

            System.out.printf("\n%d\t\t%d\t\t%d\t\t", number, power, result);
        }
    }
}