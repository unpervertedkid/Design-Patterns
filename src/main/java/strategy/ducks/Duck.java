package strategy.ducks;

import strategy.flyingbehaviors.FlyBehavior;
import strategy.quackbehaviors.QuackBehavior;

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

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


}
