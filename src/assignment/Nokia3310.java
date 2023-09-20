package assignment;

import java.util.Scanner;

public class Nokia3310 {
    Scanner input = new Scanner(System.in);
    NokiaSample myNokia = new NokiaSample();

    public void Nokia3310() {
        System.out.println("select an option");
        System.out.println("""
                1 -> Phone book
                2 -> Messages
                3 -> Chat
                4 -> Call register
                5 -> Tones
                6 -> Settings
                7 -> Call divert
                8 -> Games
                9 -> Calculator
                10 -> Reminders
                11 -> Clock
                12 -> Profiles
                13 -> Sim services
                """);
        int option = input.nextInt();
        switch (option) {
            case 1 -> PhoneBook();
            case 2 -> Messages();
            case 3 -> Chat();
            case 4 -> callRegister();
            case 5 -> Tones();
            case 6 -> Settings();
            case 7 -> CallDivert();
            case 8 -> Games();
            case 9 -> Calculator();
            case 10 -> Reminders();
            case 11 -> Clock();
            case 12 -> Profiles();
            case 13 -> SimServices();


        }
    }




    public void PhoneBook() {
        System.out.println("""
                1 -> Search
                2 -> Service Nos
                3 -> Add name
                4 -> Erase
                5 -> Edit
                6 -> Assign tone
                7 -> Send b'card
                8 -> Option
                9 -> speed dials
                10 -> Voice tags
                11 -> Go back to main menu
                 """);
        int PhoneBook = input.nextInt();
        switch (PhoneBook) {
            case 1 -> {
                System.out.println("Search");
                int search = input.nextInt();
            }
            case 2 -> {
                System.out.println("Service Nos");
                int Service = input.nextInt();
            }
            case 3 -> {
                System.out.println("Add name");
                int name = input.nextInt();
            }
            case 4 -> {
                System.out.println("Erase");
                int Erase = input.nextInt();
            }
            case 5 -> {
                System.out.println("Edit");
            }
            case 6 -> {
                System.out.println("Assign tone");
            }
            case 7 -> {
                System.out.println("Send b'card");
            }
            case 8 -> {
                System.out.println("Options");
                System.out.println("""
                        1 -> Type of view
                        2 -> Memory status
                        """);
                int Options = input.nextInt();
                switch (Options) {
                    case 1 -> {
                        System.out.println("Type of view");
                        System.out.println("Press 0 to mainMenu");
                        int mainMenu = input.nextInt();
                        if (mainMenu == 0) {
                            Nokia3310();
                        } else System.out.println("Ode press 0 ");
                    }
                    case 2 -> {
                        System.out.println("Memory status");
                        System.out.println("press O to go back to main Menu");
                        int mainMenu = input.nextInt();
                        if (mainMenu == 0) {
                            Nokia3310();
                        } else System.out.println("mumu press 2 joor");
                    }
                }

            }
            case 9 -> {
                System.out.println("Speed dials");
            }
            case 10 -> {
                System.out.println("Voice tags");
            }
            case 11 -> {
                int mainMenu = input.nextInt();
                if (mainMenu == 0) {
                    Nokia3310();
                } else System.out.println("mumu press 2 joor");
            }

        }
    }

    public void Messages() {
        System.out.println("""
                1 -> Write messages
                2 -> Inbox
                3 -> Outbox
                4 -> Picture messages
                5 -> Templates
                6 -> Smileys
                7 -> Message settings
                8 -> Info service
                9 -> Voice mailbox number
                10 -> service command editor
                11 -> return to main menu
                """);
        int Messages = input.nextInt();
        switch (Messages) {
            case 1 -> {
                System.out.println("Write messages");
            }
            case 2 -> {
                System.out.println("inbox");
            }
            case 3 -> {
                System.out.println("Outbox");
            }
            case 4 -> {
                System.out.println("Picture messages");
            }
            case 5 -> {
                System.out.println("templates");
            }
            case 6 -> {
                System.out.println("Smileys");
            }
            case 7 -> {
                System.out.println("Message setting");
                System.out.println("""
                        1 -> Set
                        2 -> Common
                        """);
                int messageSetting = input.nextInt();
                switch (messageSetting) {
                    case 1 -> {
                        System.out.println("""
                                1 -> message center number
                                2 -> message sent as
                                3 -> message validity
                                """);
                        System.out.println("Set");
                        int Set = input.nextInt();
                        switch (Set) {
                            case 1 -> {
                                System.out.println("message center number");
                            }
                            case 2 -> {
                                System.out.println("Messages sent as");
                            }
                            case 3 -> {
                                System.out.println("Message validity");
                                System.out.println("Press 0 to mainMenu");
                                int mainMenu = input.nextInt();
                                if (mainMenu == 0) {
                                    Nokia3310();
                                } else System.out.println("Ode press 0 ");
                            }


                        }
                    }
                    case 2 -> {
                        System.out.println("common");
                        System.out.println("""
                                1 -> Delivery report
                                2 -> Reply via same center
                                3 -> Character support
                                """);
                        int common = input.nextInt();
                        switch (common) {
                            case 1 -> {
                                System.out.println("Delivery report");
                            }


                            case 2 -> {
                                System.out.println("reply via same center");
                            }
                            case 3 -> {
                                System.out.println("Character support");
                                System.out.println("Press 0 to mainMenu");
                                int mainMenu = input.nextInt();
                                if (mainMenu == 0) {
                                    Nokia3310();
                                } else System.out.println("Ode press 0 ");
                            }


                        }
                    }

                }
            }
            case 8 -> {
                System.out.println("info service");
            }
            case 9 -> {
                System.out.println("service");
            }
            case 10 -> {
                System.out.println("Service command editor");
                System.out.println("Message validity");
                System.out.println("Press 0 to mainMenu");
                int mainMenu = input.nextInt();
                if (mainMenu == 0) {
                    Nokia3310();
                } else System.out.println("Ode press 0 ");
            }

        }

    }

    public void Chat() {
        System.out.println("Chat");
        int Chat = input.nextInt();
        switch (Chat) {
            case 1 -> System.out.println("Go back to main menu");

        }
    }

    public void callRegister() {
        System.out.println("Call Register");
        System.out.println("""
                1 -> Missed calls
                2 -> Received calls
                3 -> Dialled numbers
                4 -> Erase recent call duration
                5 -> Show call duration
                6 -> Show call costs
                7 -> Call cost settings
                8 -> Prepaid credit
                """);

        int callRegister = input.nextInt();
        switch (callRegister) {
            case 1 -> {
                System.out.println("Missed calls");
            }
            case 2 -> {
                System.out.println("Received calls");
            }
            case 3 -> {
                System.out.println("Dialled numbers");
            }
            case 4 -> {
                System.out.println("Erase recent call duration");
            }
            case 5 -> {
                System.out.println("Show call duration");
                System.out.println("""
                        1 -> Last call duration
                        2 -> All calls duration
                        3 -> Received calls duration
                        4 -> Dialled calls duration
                        5 -> Clear timers
                        6 -> Return to main menu
                        """);

                int callDuration = input.nextInt();
                switch (callDuration) {
                    case 1 -> {
                        System.out.println("Last call duration");
                    }
                    case 2 -> {
                        System.out.println("All calls duration");
                    }
                    case 3 -> {
                        System.out.println("Received call duration");
                    }
                    case 4 -> {
                        System.out.println("Dialled call duration");
                    }
                    case 5 -> {
                        System.out.println("Clear timer");
                        System.out.println("Message validity");
                        System.out.println("Press 0 to mainMenu");
                        int mainMenu = input.nextInt();
                        if (mainMenu == 0) {
                            Nokia3310();
                        } else System.out.println("Ode press 0 ");
                    }


                }
            }
            case 6 -> {
                System.out.println("show call cost");
                System.out.println("""
                        1 -> last call duration
                        2 -> All calls cost
                        3 -> Clear timer
                        4 -> Return to main menu
                        """);

                int callCost = input.nextInt();
                switch (callCost) {
                    case 1 -> {
                        System.out.println("Last call duration");
                    }
                    case 2 -> {
                        System.out.println("All calls cost");
                    }

                    case 3 -> {
                        System.out.println("clear timer");
                        System.out.println("Message validity");
                        System.out.println("Press 0 to mainMenu");
                        int mainMenu = input.nextInt();
                        if (mainMenu == 0) {
                            Nokia3310();
                        } else System.out.println("Ode press 0 ");
                    }


                }

            }
            case 7 -> {
                System.out.println("Call cost settings");
                System.out.println("""
                        1 -> Call cost setting
                        2 -> show costs in
                        3 -> return to main menu
                        """);

                int costSettings = input.nextInt();
                switch (costSettings) {
                    case 1 -> {
                        System.out.println("Call cost settings");
                    }
                    case 2 -> {
                        System.out.println("show costs in");
                    }
                    case 3 -> {
                        System.out.println("Message validity");
                        System.out.println("Press 0 to mainMenu");
                        int mainMenu = input.nextInt();
                        if (mainMenu == 0) {
                            Nokia3310();
                        } else System.out.println("Ode press 0 ");
                    }

                }
            }
            case 8 -> {
                System.out.println("Prepaid credit");
                System.out.println("Message validity");
                System.out.println("Press 0 to mainMenu");
                int mainMenu = input.nextInt();
                if (mainMenu == 0) {
                    Nokia3310();
                } else System.out.println("Ode press 0 ");
            }
        }

    }

    public void Tones() {
        System.out.println("Tones");
        System.out.println("""
                1 -> Ringing tone
                2 -> Ringing volume
                3 -> Incoming call alert
                4 -> Composer
                5 -> Message alert tone
                6 -> Keypad tones
                7 -> Warning and game tones
                8 -> Vibrating alert
                9 -> Screen saver
                """);

        int Tones = input.nextInt();
        switch (Tones) {
            case 1 -> {
                System.out.println("Ringing tones");
            }
            case 2 -> {
                System.out.println("Ringing volume");
            }
            case 3 -> {
                System.out.println("Incoming call alert");
            }
            case 4 -> {
                System.out.println("Composer");
            }
            case 5 -> {
                System.out.println("Message alert tone");
            }
            case 6 -> {
                System.out.println("Keypad tones");
            }
            case 7 -> {
                System.out.println("arning and game");
            }
            case 8 -> {
                System.out.println("Vibrating alert");
            }
            case 9 -> {
                System.out.println("Screen saver");
                System.out.println("Press 0 to mainMenu");
                int mainMenu = input.nextInt();
                if (mainMenu == 0) {
                    Nokia3310();
                } else System.out.println("Ode press 0 ");
            }
        }

    }
    public void Settings(){
        System.out.println("settings");
        System.out.println("""
                1 -> Call settings
                2 -> Phone settings
                3 -> security settings
                4 -> Restore factory settings
                """);
        System.out.println("settings");
        int Settings = input.nextInt();
        switch (Settings){
            case 1 ->{
                System.out.println("Call settings");
                System.out.println("""
                        1 -> Automatic redial
                        2 -> Speed dialling
                        3 -> Call waiting options
                        4 -> Own number sending
                        5 -> Phone line in use
                        6 -> Automatic answer
                        """);
                int CallSettings = input.nextInt();
                switch (CallSettings){
                    case 1 -> {
                        System.out.println("Automatic redial");
                    }
                    case 2 -> {
                        System.out.println("Speed dialling");
                    }
                    case 3 -> {
                        System.out.println("Call waiting options");
                    }
                    case 4 -> {
                        System.out.println("Own number sending");
                    }
                    case 5 -> {
                        System.out.println("Phone line in use");
                    }
                    case 6 -> {
                        System.out.println("Automatic answer");
                        System.out.println("Press 0 to mainMenu");
                        int mainMenu = input.nextInt();
                        if (mainMenu == 0) {
                            Nokia3310();
                        } else System.out.println("Ode press 0 ");
                    }

                }

            }
            case 2 ->{
                System.out.println("Phone settings");
                System.out.println("""
                        1 -> Language
                        2 -> Cell info display
                        3 -> Welcome note
                        4 -> Network selection
                        5 -> Lights
                        6 -> Confirm SIM service actions
                        """);
                int Phonesettings = input.nextInt();
                switch (Phonesettings){
                    case 1 -> {
                        System.out.println("Language");
                    }
                    case 2 -> {
                        System.out.println("Cell info display");
                    }
                    case 3 -> {
                        System.out.println("Welcome note");
                    }
                    case 4 -> {
                        System.out.println("Network selection");
                    }
                    case 5 -> {
                        System.out.println("Lights");
                    }
                    case 6 -> {
                        System.out.println("Confirm SIM service actions");
                        System.out.println("Press 0 to mainMenu");
                        int mainMenu = input.nextInt();
                        if (mainMenu == 0) {
                            Nokia3310();
                        } else System.out.println("Ode press 0 ");
                    }
                }
            }
            case 3 -> {
                System.out.println("Restore factory settings");
            }
        }

    }
    public void CallDivert() {
        System.out.println("Call Divert");
        System.out.println("Press 0 to mainMenu");
        int mainMenu = input.nextInt();
        if (mainMenu == 0) {
            Nokia3310();
        } else System.out.println("Ode press 0 ");
    }
    public void Games () {
        System.out.println("Games");
        System.out.println("Press 0 to mainMenu");
        int mainMenu = input.nextInt();
        if (mainMenu == 0) {
            Nokia3310();
        } else System.out.println("Ode press 0 ");
    }
    public  void Calculator() {
        System.out.println("Calculator");
        System.out.println("Press 0 to mainMenu");
        int mainMenu = input.nextInt();
        if (mainMenu == 0) {
            Nokia3310();
        } else System.out.println("Ode press 0 ");
    }
    public void Reminders() {
        System.out.println("Reminders");
        System.out.println("Press 0 to mainMenu");
        int mainMenu = input.nextInt();
        if (mainMenu == 0) {
            Nokia3310();
        } else System.out.println("Ode press 0 ");

    }
    public void Clock() {
        System.out.println("Clock");
        System.out.println("""
                1 -> Alarm clock
                2 -> Clock settings
                3 -> Date setting
                4 -> Stopwatch
                5 -> Countdown timer
                6 -> Auto update of date and time
                """);
        int Clock = input.nextInt();
        switch (Clock){
            case 1 -> {
                System.out.println("Alarm clock");
            }
            case 2 -> {
                System.out.println("Clock settings");
            }
            case 3 -> {
                System.out.println("Date setting");
            }
            case 4 -> {
                System.out.println("Stock watch");
            }
            case 5 -> {
                System.out.println("Counter down Timer");
            }
            case 6 -> {
                System.out.println("Auto update of date and time");
                System.out.println("Press 0 to mainMenu");
                int mainMenu = input.nextInt();
                if (mainMenu == 0) {
                    Nokia3310();
                } else System.out.println("Ode press 0 ");
            }
        }

    }
    public void Profiles () {
        System.out.println("Profiles");
        System.out.println("Auto update of date and time");
        System.out.println("Press 0 to mainMenu");
        int mainMenu = input.nextInt();
        if (mainMenu == 0) {
            Nokia3310();
        } else System.out.println("Ode press 0 ");
    }
    public void SimServices(){
        System.out.println("Sim Services");
        System.out.println("Auto update of date and time");
        System.out.println("Press 0 to mainMenu");
        int mainMenu = input.nextInt();
        if (mainMenu == 0) {
            Nokia3310();
        } else System.out.println("Ode press 0 ");

    }


}










