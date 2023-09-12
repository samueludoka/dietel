package chapterThree;

public class ClockApplication {
    public static void main(String[] args) {
        Clock clock = new Clock(67, 60, 40);
        String result = clock.displayTime();
        System.out.println(result);



    }
}
