package chapter7Exercise;

import java.util.Arrays;

public class Hcf {
    public static int[] getFactors(int number) {
        int factorNumber = 1;
        int varArrayStoreID = 0;
        int[] factors = null;

        while(factorNumber <= number){
            if(number % factorNumber == 0){
                varArrayStoreID = varArrayStoreID + 1;
                factors[varArrayStoreID] = factorNumber;
            }
            factorNumber++;
        }

        return factors;
    }
}
