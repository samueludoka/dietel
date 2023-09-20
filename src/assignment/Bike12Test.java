import java.util.Scanner;
public class Bike12Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bike12 bike = new Bike12();

        System.out.println("Enter bike name");
        String name = input.nextLine();
        bike.setName(name);
        bike.setOn(true);
        System.out.printf("The name of the bike is %s and it is %s %n" , bike.getName() , bike.isOn() ? "on": "off");


    }
}
