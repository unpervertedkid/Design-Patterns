package strategy;

import strategy.ducks.Duck;
import strategy.ducks.MallardDuck;
import strategy.ducks.ModelDuck;
import strategy.flyingbehaviors.FlyRocketPowered;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.swim();

        System.out.println("-----------------------");

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
