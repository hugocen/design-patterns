package strategy.DuckSimulator.Ducks;

import strategy.DuckSimulator.Behaviors.Fly.FlyWithWings;
import strategy.DuckSimulator.Behaviors.Quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
