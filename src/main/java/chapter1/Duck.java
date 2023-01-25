package chapter1;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Swim");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    abstract public void display();
}
