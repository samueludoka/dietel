package chapterThree;

public class HeartRateTest {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int maximumHeartRateBeat;
    private int targetedHeartRate;
    private  int age;
    private int calculateTargetedHeartRate;

    public void HeartRate (String firstName, String lastName, int dayOfBirth,
                           int monthOfBirth, int yearOfBirth,
                           int maximumHeartRateBeat, int targetedHeartRate,int age, int calculateTargetedHeartRate){


        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.calculateTargetedHeartRate = calculateTargetedHeartRate;

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

    public int getMaximumHeartRateBeat() {
        return maximumHeartRateBeat;
    }

    public int getTargetedHeartRate() {
        return targetedHeartRate;
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
    public int calculateAge (){
        int age = 2023 - yearOfBirth;
        return age;
    }

    public void setMaximumHeartRateBeat(int maximumHeartRateBeat) {
        this.maximumHeartRateBeat = maximumHeartRateBeat;
    }
    public int calculateMaximumHeartRateBeat(){
        int maximumHeartRateBeat = 220 - age;
        return maximumHeartRateBeat;
    }

    public void setTargetedHeartRate(int targetedHeartRate) {
        this.targetedHeartRate = targetedHeartRate;
    }
    public int getCalculateTargetedHeartRate(){
        int restingHeartRate = 70;
        double intensityOfExercise = 0.60;
        int heartRateReserved = maximumHeartRateBeat - restingHeartRate;
        int fds = heartRateReserved  + restingHeartRate;
        double targetedHeartRate = fds * intensityOfExercise;
        return (int) targetedHeartRate;
    }


}
