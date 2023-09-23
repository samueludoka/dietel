package chapter4Exercises;

public class WorldPopulation {
    public static void main(String[] args) {
        long realPopulation = 80453114470L;
        double growthRate = 0.0083;
        System.out.println("Year\tPopulation\t\t\t\tPopulation increase");

        double population = realPopulation;
        int year = 1;

        while (year <= 75){
            double increase = population * growthRate;
            population+=increase;
            System.out.printf("%d\t\t%f\t\t%f%n",year,population,increase);
            year++    ;
        }

    }
}
