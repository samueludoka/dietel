package chapterThree;

public class SalesCommissionCalculator {
    private int salesCommission;
    private int grossPercentage;

    public SalesCommissionCalculator(){
        salesCommission = 200;
        grossPercentage = 9;
    }
    public void setGrossPercentage(int grossPercentage) {
        this.grossPercentage = grossPercentage;
    }
    public int getGrossPercentage(){
        return grossPercentage;
    }
}
