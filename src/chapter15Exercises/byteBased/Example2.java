package chapter15Exercises.byteBased;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        String location = "C:\\Users\\Samuel\\IdeaProjects\\sammysWork\\src\\chapter15Exercises\\byteBased\\txtExercise";
        try(FileOutputStream outputStream = new FileOutputStream(location)){
            String data = "up Nepa!";
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
        }catch(IOException exception){
            exception.printStackTrace();

        }
    }
}
