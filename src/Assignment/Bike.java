package chapterThree;

public class Bike {
    private boolean isOn;
    private boolean isOff;
    private int accelerate = 0;
    private int gear;
    ;

    public void turnOn() {
        this.isOn = true;
    }

    public boolean getTurnOn() {
        return isOn;
    }

    public void turnOff() {
        this.isOff = true;
    }

    public boolean getTurnOff() {
        return isOff;
    }


    public int getAccelerate() {
        return accelerate;
    }

    public int getGear() {
        return gear;
    }


    public void accelerate() {
        if (accelerate == 0 || accelerate < 20) {
            accelerate = accelerate + 1;
            gear = 1;
        } else if (accelerate == 21 || accelerate <= 30) {
            this.accelerate = accelerate + 2;
            gear = 2;

        } else if (accelerate == 31 || accelerate <= 40) {
            this.accelerate = accelerate + 3;
            gear = 3;
        } else {
            this.accelerate = accelerate + 4;
            gear = 4;
        }

    }

    public void decelerate() {

        if (accelerate == 0 || accelerate <= 20) {
            accelerate -= 1;
        } else if (accelerate == 21 || accelerate <= 29) {
            accelerate -= 2;
        } else if (accelerate == 30 || accelerate <= 41) {
            accelerate -= 3;
        } else if (accelerate == 41 || accelerate > 41){
            accelerate -= 4;
        }


    }
}




























