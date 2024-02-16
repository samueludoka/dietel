package chapter15Exercises.byteBased;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args){
        String fileLocation = "C:\\Users\\Samuel\\IdeaProjects\\sammysWork\\src\\chapter15Exercises\\byteBased\\txtExercis";
        try(FileInputStream fileInputStream = new FileInputStream(fileLocation)){
            byte[] b = fileInputStream.readNBytes(10);
            System.out.println(new String(b));
            byte[] fileBytes = fileInputStream.readAllBytes();
            System.out.println(new String(fileBytes));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
