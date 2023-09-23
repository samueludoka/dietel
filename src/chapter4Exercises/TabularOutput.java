package chapter4Exercises;

public class TabularOutput {
    public static void main(String[] args) {
        int count;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        System.out.println("N\tN2\tN3\tN4");
        for (count = 1; count <= 5; count++) {
            count1 = count * count;
            count2= count * count * count;
            count3 = count * count * count * count;
            System.out.println(count + "\t" + count1 + "\t" + count2 + "\t" + count3);




        }



    }
}
