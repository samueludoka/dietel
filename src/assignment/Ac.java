package chapterThree;

public class Ac {
    private int temperature = 16;
    private boolean acSwitch;

    public void turnOn() {
        acSwitch = true;
    }

    public boolean getAcSwitch() {
        return acSwitch;
    }

    public void turnOff() {
        acSwitch = false;
    }


    public void increaseTemperature() {
        if (temperature < 30) {
            this.temperature = temperature + 1;
        } else {
            System.out.print(30);
        }
    }
    public void decreaseTemperature() {
        if (temperature > 16) {
            this.temperature = temperature - 1;
        } else {
            System.out.print(16);
        }

    } public int getTemperature(){
        return temperature;
    }


}



