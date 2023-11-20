package assignmentProject;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    public void creatTime() {
        Time time = new Time(1, 0, 0);
        assertEquals(1, time.gethour());
        assertEquals(0, time.getminute());
        assertEquals(0, time.getsecond());
    }

    @Test
    public void creatTimeWithInvalidHourTest() {
        assertThrows(IllegalArgumentException.class, () -> new Time(25, 0, 0));
    }

    @Test
    public void creatTimeWithInvalidMinuteTest() {
        assertThrows(IllegalArgumentException.class, () -> new Time(0, 77, 0));
    }

    @Test
    public void creatTimeWithInvalidSecondTest() {
        assertThrows(IllegalArgumentException.class, () -> new Time(25, 0, 77));
    }

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hour: ");


        Time time = new Time(12, 0, 0);
        int hour = 0;
        try {
            hour = input.nextInt();
        }catch (InputMismatchException ex) {
            System.out.println("Olodo");
            main();
        }
        try {
            time = new Time(hour, 30, 21);
            System.out.println(time.gethour());
        }catch (IllegalArgumentException exception) {
            System.out.println("Olodo put correct hour");
            main();
        }


    }
}