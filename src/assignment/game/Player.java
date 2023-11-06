package assignment.game;

public class Player {

    private String firstName;
    private String lastName;
    private String middleName;

    private int age;


    public String registerNewPlayer(String firstName, String lastName, String middleName, int age){
        if (firstName.isEmpty()|| firstName.isBlank()) throw  new RuntimeException("please name is needed");
        if (lastName.isEmpty()|| lastName.isBlank()) throw  new RuntimeException("please name is needed");
        if (middleName.isEmpty()|| middleName.isBlank()) throw  new RuntimeException("please name is needed");
        if (age < 18 ) throw new RuntimeException("you're too young");
        this.age = age;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        return firstName+" "+lastName+"\n welcome to the game ";

    }

}
