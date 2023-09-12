package chapterThree;

public class Car {
    private double price;
    private int model;
    private int year;

    public Car(double price, int model, int year) {
       this.model = model;
       this.price = price;
       this.year = year;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public void setModel(int model){
        this.model = model;
    }
    public int getModel(){
        return model;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }



}
