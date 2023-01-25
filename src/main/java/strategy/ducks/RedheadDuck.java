package strategy.ducks;

import strategy.flyingbehaviors.FlyWithWings;
import strategy.quackbehaviors.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("I'm a real Redhead duck");
    }
}
