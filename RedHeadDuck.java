public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        quackBehaviour = new Quack();
        swimBehaviour = new SwinWithLegs();
        flyBehaviour = new Fly();
    }

    @Override
    public void display() {
        System.out.println("I'm a RedHead Duck");
    }
}
