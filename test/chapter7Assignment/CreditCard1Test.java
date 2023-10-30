package chapter7Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCard1Test {
    @Test
    public void testThatCardNumberIsValid(){
        String[] cardNumber = {"4", "3", "8", "8", "5", "7", "6", "0", "1", "8", "4", "0", "2", "6", "2", "6"};
        String[] result = new String[]{CreditCard1.creditCardNumber(cardNumber)};
        String[] answer = {"4", "3", "8", "8", "5", "7", "6", "0", "1", "8", "4", "0", "2", "6", "2", "6"};
        assertArrayEquals(result, answer);
//        assertEquals("4",answer[0]);
//        assertEquals("3",answer[1]);
//        assertEquals("8",answer[2]);
//        assertEquals("8",answer[3]);
//        assertEquals("5",answer[4]);
//        assertEquals("7",answer[5]);
//        assertEquals("6",answer[6]);
//        assertEquals("0",answer[7]);
//        assertEquals("1",answer[8]);
//        assertEquals("8",answer[9]);
//        assertEquals("4",answer[10]);
//        assertEquals("0",answer[11]);
//        assertEquals("2",answer[12]);
//        assertEquals("6",answer[13]);
//        assertEquals("2",answer[14]);
//        assertEquals("6",answer[15]);
    }
    @Test
    public void testForCardValiditory(){
        String[] cardNumber = {"4", "3", "8", "8", "5", "7", "6", "0", "1", "8", "4", "1", "0", "7", "0", "7"};
        boolean answer = true;
        boolean result = CreditCard1.cardValidate(cardNumber);
        assertEquals(answer, result);

    
    }

}