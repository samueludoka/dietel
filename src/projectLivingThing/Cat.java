package projectLivingThing;

public class Cat extends Animal{
    @Override
    public void move() {
        super.move();
        System.out.println("Cat Walking");
    }
}
