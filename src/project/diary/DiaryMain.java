package project.diary;

import project.diary.exception.InvalidPinException;

import java.util.Scanner;

public class DiaryMain {
    static Diaries myDiaries = new Diaries();
    static Diary myDiary = new Diary("userName", "password");

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
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Entry id: ");
        int id = input.nextInt();
        System.out.println("Enter Entry title: ");
        String title = input.nextLine();
        System.out.println("Enter Entry body: ");
        String body = input.nextLine();
        myDiary.update(id,title,body);
        System.out.printf("Entry in %d has been updated to %s, and %s", id,title,body);



    }

    private static void DeleteAnEntry() throws InvalidPinException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Entry id: ");
        int id = input.nextInt();
        myDiary.deleteAnEntry(id);
        System.out.printf("Entry in line %d has been successfully deleted",id);
        mainMenu();


    }

    private static void createEntryInDairy() throws InvalidPinException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Entry title: ");
        String title = input.nextLine();
        System.out.println("Enter Entry body: ");
        String body = input.nextLine();
        try{
            myDiary.createAnEntry(title,body);
            System.out.println("entry created successfully");
            mainMenu();
        }
        catch (InvalidPinException e){
            System.out.println(e.getMessage());
            mainMenu();
        }

    }

    private static void unlockDiary() throws InvalidPinException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ya Diary name: ");
        String name = input.nextLine();
        System.out.println("Enter password: ");
        String password = input.nextLine();
        try {
            myDiaries.unlockDiary(password);
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
        myDiaries.add(name, password);
        System.out.println("Diary Created Successfully\n"+"Diary Name is "+name+" and password is "+password);
        mainMenu();
    }
}
