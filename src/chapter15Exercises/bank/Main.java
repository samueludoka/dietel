package chapter15Exercises.bank;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String location = "C:\\Users\\Samuel\\IdeaProjects\\sammysWork\\src\\chapter15Exercises\\bank\\transaction.txt";
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("Isreal", "Delighted", BigDecimal.valueOf(4000).toString()));
        transactions.add(new Transaction("ope", "Delighted", BigDecimal.valueOf(4000).toString()));
        transactions.add(new Transaction("Tobi", "ope", BigDecimal.valueOf(5000).toString()));


        writeTransactionTo(transactions, location);
        
     }
     private  static  void writeTransactionTo(List<Transaction> transactions, String fileLocation){
         try (FileOutputStream outputStream = new FileOutputStream(fileLocation, true)) {
//             added true to append helps to write a new file without truncating the originally existing file;
             String trans = "\n"+transactions.toString();
             outputStream.write(trans.getBytes());
         } catch (IOException exception) {
             exception.printStackTrace();
         }
     }
}
