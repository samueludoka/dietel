package chapterThree;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int maximumHeartRate;
    private int age;
    private double targetedHeartRate;

    public HeartRate (String firstName, String lastName, int dayOfBirth,int monthOfBirth, int yearOfBirth){

        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
//        this.targetedHeartRate = targetedHeartRate;

}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getMaximumHeartRate() {
        return maximumHeartRate;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
       this.yearOfBirth = yearOfBirth;
    }

    public int getAge (){ return age;}
    public void setAge(int yearOfBirth){
       age = 2023 - yearOfBirth;
    }

    public void setMaximumHeartRate(int age){
        maximumHeartRate = 220 - age;
    }

    public void setTargetedHeartRate(double percentageIntensity) {
        double targetedHeartRate = (double) (maximumHeartRate * percentageIntensity);
     if (percentageIntensity >= 0.64 && percentageIntensity <= 0.76) {
         System.out.printf("\nyour moderate targeted heart intensity is %.2f ", targetedHeartRate);;
     } else if (percentageIntensity >= 0.77 && percentageIntensity <= 0.93) {
         System.out.printf("\nYour vigorous targeted heart intensity is%.2f ", targetedHeartRate);
     }


     }



    public double getTargetedHeartRate(){
        return targetedHeartRate;
    }


}
