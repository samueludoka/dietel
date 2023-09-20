package assignment;
public class Factorial2 {
    public static void main(String[] args) {


    int fact = 1;
    int count = 9;
    for (count = 9; count > 1 ;count --) {
        fact = fact * count;

    }
    System.out.print(fact);
}
}