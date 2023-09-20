package assignment;

import java.util.Scanner;

public class SwitchXmas {
    public static void main(String[] args) {
    while (true){
        Xmas();
    }

    }

        public static void Xmas(){
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        switch (userInput) {
            case 1 -> System.out.println("verse 1");
            case 2 -> System.out.println("verse 2");
            case 3 -> System.out.println("verse 3");
            case 4 -> System.out.println("verse 4");
            case 5 -> System.out.println("verse 5");
            case 6 -> System.out.println("verse 6");
            case 7 -> System.out.println("verse 7");
            case 8 -> System.out.println("verse 8");
            case 9 -> System.out.println("verse 9");
            case 10 -> System.out.println("verse 10");
            case 11 -> System.out.println("verse 11");
            case 12 -> System.out.println("verse 12");

        }

        switch (userInput){
            case 1:
                System.out.println("""
                                              
                        verse1
                        On the first day of Christmas, my true love sent to me
                        A partridge in a pear tree
                            """);
                break;

            case 2:
                System.out.println("""
                        
                        verse 2
                        On the second day of Christmas, my true love sent to me
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 3:
                System.out.println("""
                        
                        verse 3
                        On the third day of Christmas, my true love sent to me
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 4:
                System.out.println("""
                        
                        verse 4
                        On the fourth day of Christmas, my true love sent to me
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 5:
                System.out.println("""
                        
                        verse 5
                        On the fifth day of Christmas, my true love sent to me
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 6:
                System.out.println("""
                        
                        verse 6
                        On the sixth day of Christmas, my true love sent to me
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 7:
                System.out.println("""
                        
                        verse 7
                        On the seventh day of Christmas, my true love sent to me
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 8:
                System.out.println("""
                        
                        verse 8
                        On the eighth day of Christmas, my true love sent to me
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 9:
                System.out.println("""
                        
                        verse 9
                        On the ninth day of Christmas, my true love sent to me
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 10:
                System.out.println("""
                        
                        verse 10
                        On the tenth day of Christmas, my true love sent to me
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 11:
                System.out.println("""
                        
                        verse 11
                        On the eleventh day of Christmas, my true love sent to me
                        Eleven pipers piping
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;

            case 12:
                System.out.println("""
                        
                        case 12:
                        On the twelfth day of Christmas, my true love sent to me
                        Twelve drummers drumming
                        Eleven pipers piping
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree
                        """);
                break;
            default:
                System.out.println("wrong input");

        }
    }
}
