package project.diary;

import project.diary.exception.InvalidPinException;

import java.util.Scanner;

public class DiaryMain {
    static Diary myDiary = new Diary("diaryName", "password");

    public static void main(String[] args) throws InvalidPinException {
        mainMenu();
    }
    public static void mainMenu() throws InvalidPinException {
        System.out.println("""
                ====================================================
                                    DIARY APP
                ====================================================
                pls punch
                1 -> Create Diary.
                2 -> Unlock Diary.
                3 -> Create Entry In Diary.
                4 -> Delete An Entry.
                5 -> Update Entry.
                ====================================================
                ====================================================
                """);
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        switch(option){
            case 1 -> createDiary();
            case 2 -> unlockDiary();
            case 3 -> createEntryInDairy();
            case 4 -> DeleteAnEntry();
            case 5 -> UpdateEntry();
        }
    }

    private static void UpdateEntry() {


    }

    private static void DeleteAnEntry() {
    }

    private static void createEntryInDairy() {
    }

    private static void unlockDiary() throws InvalidPinException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ya Diary name: ");
        String name = input.nextLine();
        System.out.println("Enter password: ");
        String password = input.nextLine();
        try {
            myDiary.unlockDiary(password);
            System.out.println("Diary unlocked successfully");
            mainMenu();
        }
        catch (InvalidPinException e){
            System.out.println(e.getMessage());
            mainMenu();
        }





    }

    private static void createDiary() throws InvalidPinException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ya Diary name: ");
        String name = input.nextLine();
        System.out.println("Enter password: ");
        String password = input.nextLine();
        myDiary.createDiary(name, password);
        System.out.println("Diary CreatedSuccessfully\n"+"Diary Name is "+name+" and password is "+password);
        mainMenu();
    }
}
