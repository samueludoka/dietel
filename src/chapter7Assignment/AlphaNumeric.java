package chapter7Assignment;



public class AlphaNumeric {
    public static int digitsInString(String[] numbers) {
        String[] scores = {"ABC21F", "13CPZ", "A1L"};
        int counts = 0;
        for (int count = 0; count < numbers.length; count++) {
            for (int counter = 0; counter < numbers[count].length(); counter++)
                if (numbers[count].charAt(counter) == '0'
                        || numbers[count].charAt(counter) == '1'
                        || numbers[count].charAt(counter) == '2'
                        || numbers[count].charAt(counter) == '3'
                        || numbers[count].charAt(counter) == '4'
                        || numbers[count].charAt(counter) == '5'
                        || numbers[count].charAt(counter) == '6'
                        || numbers[count].charAt(counter) == '7'
                        || numbers[count].charAt(counter) == '8'
                        || numbers[count].charAt(counter) == '9') {
                    counts++;
                }

        }
        return counts;
    }

    public static boolean isPalindrone(String letters) {
        int counter = 0;
        int count;
        for (count = 0; count < counter; count++) {
            for (counter = 0; counter < letters.length(); counter++) {
            }

        }
        if (letters.charAt(count) == letters.charAt(counter)) {
            return true;
        } else {

            return false;
        }
    }

    public static boolean isAnagram(String letter, String letter2) {
        String wrd = "mate";
        String wrd2 = "mate";
        int counter;
        int count;
        for (count = 0; count < wrd.length(); count++) {
            for (counter = 0; counter < wrd2.length(); counter++) {
                if (letter.charAt(count) == letter2.charAt(counter)) {
                    return true;
                } else {

                }
            }


        }
        return true;
    }
}
    //public static boolean
