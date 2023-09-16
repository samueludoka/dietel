package chapterThree;
import java.util.Scanner;
public class HeartRateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HeartRate heartRate = new HeartRate("Sam", "dan", 12,9, 1995);
        heartRate.setFirstName("sam");
        System.out.printf("The patient's first name is %s", heartRate.getFirstName());
        heartRate.setLastName("dan");
        System.out.printf("\nThe patient's last name is %s", heartRate.getLastName());
        heartRate.setAge(1995);
        System.out.printf("\nThe patient's age is %d ",heartRate.getAge());

        heartRate.setMaximumHeartRate(heartRate.getAge());
        System.out.printf("\nYour Maximum Heart Rate is %d",heartRate.getMaximumHeartRate());
        System.out.println("'\nEnter exercise intensity: ");
        double percentageIntensity = input.nextDouble();
        heartRate.setTargetedHeartRate(percentageIntensity);
        heartRate.getTargetedHeartRate();


    }
}
