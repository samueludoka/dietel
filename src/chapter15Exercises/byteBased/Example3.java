package chapter15Exercises.byteBased;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        String location = "C:\\Users\\Samuel\\Desktop\\data base.txt";
        try(DataInputStream inputStream = new DataInputStream(
                new FileInputStream(location)
        )){
            byte[] bytes = inputStream.readAllBytes();
            System.out.println(new String(bytes));
        }catch(IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
