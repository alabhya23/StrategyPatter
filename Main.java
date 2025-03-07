//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MallarDuck md = new MallarDuck();
        RedHeadDuck rd = new RedHeadDuck();
        System.out.println("___________");
        RubberDuck rubber = new RubberDuck();
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("____________");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("____________");
        rubber.display();
        rubber.performQuack();
        rubber.performSwim();
        rubber.performFly();
        System.out.println("____________");
    }
}
