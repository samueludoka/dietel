package chapterThree;

public class ClockApplication {
    public static void main(String[] args) {
        Clock clock = new Clock(35, 73, 80);
        String result = clock.displayTime();
        System.out.println(result);



    }
}
