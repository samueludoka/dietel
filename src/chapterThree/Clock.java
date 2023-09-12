package chapterThree;

public class Clock {
    private int hour;
    private int minute;
    private int seconds;

    public Clock(int hour, int minute, int seconds) {
        if (hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
        if (minute > 59) {
            this.minute = 0;
        } else {
            this.minute = minute;
            if (seconds > 59) {
                this.seconds = 0;
            } else {
                this.seconds = seconds;
            }
        }
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public String displayTime() {
        return getHour() + " : " + getMinute() + " : " + getSeconds();
    }
}