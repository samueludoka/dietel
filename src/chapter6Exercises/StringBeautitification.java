package chapter6Exercises;

import java.util.Locale;

public class StringBeautitification {
    public static String addFullStopTo(String string){
        int indexOfLastElement = string.length()-1;
        char lastCharacter = string.charAt(indexOfLastElement);
        boolean stringDoesntContainFullStop = !(lastCharacter + "").equals(".");
        if (stringDoesntContainFullStop) return string + ".";
        else return string;
    }

    public static String addFirstLetterCaps(String word) {
        return ((word.charAt(0) + "").toUpperCase(Locale.ROOT) + word.substring(1));
    }

    public static String addFirstLetterCapsAndFullStop(String word) {
        return addFullStopTo(addFirstLetterCapsAndFullStop(word));
    }
}
