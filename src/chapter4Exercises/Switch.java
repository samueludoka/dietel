package chapter4Exercises;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                press
                1 -> English
                2 -> Yoruba
                3 -> Pidgin
               
                """);
     int userInput = input.nextInt();
        switch (userInput){
            case 1:
                System.out.println("English");
                break;
            case 2:
                System.out.println("Yoruba");
                break;
            case 3:
                System.out.println("Pidgin");
                System.out.println("You wana speak pidgin? 1 or 2?");
                int speakWafi = input.nextInt();
                switch (speakWafi) {
                    case 1:
                        System.out.println("Pidgin mode on");
                        break;
                    case 2:
                        System.out.println("Pidgin mode off");
                        break;
                }
                break;
            default:
                System.out.println("YOU DONT HAVE SENSE!!!!!!!!!");
        }
    }
}
