package chapter7Exercise;

public class OddIndexArray {
    public static  int[] oddIndexArray(int[] scores){
        int[] number = new int [scores.length];
        int[] newArr = {};
        int counter = 0;
        for (int count = 0; count <= scores.length; count = count+2) {
            newArr = scores;
            counter++;
        }
        return newArr;
    }
    public static int[] squareArrayElement(int[] scores){
        int[] number = new int [scores.length];
        for (int count = 0; count < scores.length; count++) {
            for (int counter = count +1; counter < scores.length; counter++) {
                if(scores[counter] < scores[count]){
                    int temp = scores[count];
                    scores[count] = scores[counter];
                    scores[counter] = temp;
                }

            }

        }
        for (int count = 0; count < scores.length; count++) {
            scores[count] *= scores[count];

        }
        return scores;
    }
    public static String elementsOfArrayVoidOfVowels(String words) {
        words = words.toUpperCase();
        String vowel = "aeiou".toUpperCase();
        String seem = "";
        String word = "";
        for (int count = 0; count < vowel.length(); count++) {
            for (int counter = 0; counter < words.length(); counter++) {
                if (vowel.charAt(count) != words.charAt(counter)) {
                    seem += String.valueOf(words.charAt(counter));
                }
            }
            words = seem;
            word = seem;
            seem = "";


        }
        return word.toLowerCase();

    }
    public static int[] StringNumber(String number){
        String result = "0 3 7 9 6 ";
        int highestNumber = 0;
        int lowestNumber = 0;
        int[] tempArray = {};
        int counter = 0;
        for (int count = 0; count < result.length(); count++) {
            if(count >= highestNumber){
                highestNumber = count;
            } else if (count<= lowestNumber) {
                lowestNumber = count;

            }
            tempArray = new int[]{highestNumber};
            tempArray = new int[]{lowestNumber};

        }
        return tempArray;
    }
}
