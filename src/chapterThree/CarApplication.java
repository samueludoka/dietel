    package chapterThree;
    import java.util.Scanner;
    public class CarApplication{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car car = new Car(55664422,2000,2002);

        System.out.print("\nEnter price of car: ");
        double price = input.nextDouble();
        car.setPrice(price);

        System.out.print("\nEnter model: ");
        int model = input.nextInt();
        car.setModel(model);

        System.out.print("\n Enter year: ");
        int year = input.nextInt();
        car.setYear(year);

        double lan = price;
        double utt = lan * 0.70;

        System.out.printf("Enter Price of Car: %f%n",car.getPrice());
        System.out.printf("Discounted car price: %f%n",utt);
        System.out.printf("Car model is: %d%n",car.getModel());
        System.out.printf("Year of production is: %d%n",car.getYear());



    }
}