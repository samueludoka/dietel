package chapter15Exercises.byteBased;

import chapter15Exercises.bank.Transaction;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class Example5 {
    public static void main(String[] args) throws FileNotFoundException {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(System.out)){
            Transaction transaction = new Transaction("Tobi", "Ope","300");
            outputStream.writeObject(transaction);

        }catch(IOException exception){
            exception.printStackTrace();
        }
    }
}
