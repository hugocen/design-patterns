package strategy.DuckSimulator.Ducks;

import strategy.DuckSimulator.Behaviors.Fly.FlyNoWay;
import strategy.DuckSimulator.Behaviors.Quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }

}
