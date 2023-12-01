package projectUser2;

public class GreetingsApplication {
    public static void main(String[] commandLineArgs) {
        User u1 = new User("jake");
        User u2 = new User("Katy");

        u1.greet();
        u2.greet();

    }

}
