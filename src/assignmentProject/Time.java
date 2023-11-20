package assignmentProject;

public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {
        if (hour > 23 || hour < 0) throw new IllegalArgumentException("hour is invalid");
        if (minute > 59 || minute < 0) throw new IllegalArgumentException("minute is invalid");
        if (second > 59 || second < 0) throw new IllegalArgumentException(" is invalid");
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public int gethour() {
        return hour;
    }

    public int getminute() {
        return minute;
    }

    public int getsecond() {
        return second;
    }
}
