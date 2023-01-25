package chapter1;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.quack();
        mallard.swim();

        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.quack();
        redhead.swim();
    }
}
