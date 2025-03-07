public class RubberDuck extends Duck {
    public RubberDuck() {
    quackBehaviour = new Squeak();
    swimBehaviour = new Floating();
    flyBehaviour = new NotFly();
    }
    @Override
    public void display() {
        System.out.println("Rubber Ducky!");
    }
}
