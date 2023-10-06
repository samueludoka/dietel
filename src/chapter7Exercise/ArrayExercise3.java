package chapter7Exercise;

public class ArrayExercise3 {
    public static void main(String[] args) {
        String [] lists = {"A", "B", "C", "D", "E", "F"};
        String [] listz = {"A", "D", "B", "E", "C", "F"};
        String [] values =  twoLists(lists);
    }
    public static String[]twoLists(String[]list){
        String [] value = new String[list.length];
        int num = 0;
        for (int i = 0; i < list.length; i++) {
            value[num] = list[i];
            num += 2;
        }
        int numb = 0;
        for (int j = 0; j < list.length; j++) {
            value[numb] = String.valueOf(list[j]);
            if(numb < value.length - 2) numb += 2;
            else numb++;
        }
        return value;
    }
}
