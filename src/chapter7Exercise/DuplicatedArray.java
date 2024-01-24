package chapter7Exercise;

public class DuplicatedArray {
    public static int returnNonDuplicateElement(int[] scores) {
        for (int count = 0; count < scores.length; count++) {
            for (int counter = 0; counter < scores.length; counter++) {
                if (scores[count] == scores[counter] && count != counter) {
                    scores[counter] = 0;
                    scores[count] = 0;
                }
            }
        }
        return getUniqueValue(scores);

    }

    private static int getUniqueValue(int[] scores) {
        for (int i = 0; i < scores.length ; i++) {
            if (scores[i] != 0) return scores[i];
        }
        return 0;
    }
//    public static int returnNonDuplicateElement(int[] scores) {
//        int[] num = {4,3,2,1,1,2,2,3};
//        int rev = 0;
//        for (int count = 0; count <= num.length; count++) {
//            for (int counter = count + 1; counter < num.length; counter++) {
//                if (scores[count] == scores[counter]) {
//                    scores[counter] = 0;
//                    scores[count] = 0;
//                }
//            }
//        }
//        return getUniqueValue(scores);
//
//    }

//    private static int getUniqueValue(int[] scores) {
//        int i = 0;
//        for (i = 0; i < scores.length ; i++) {
//            if (scores[i] != 0)return scores[i];
//        }
//        return scores[i];
//    }


}