package strategy_pattern.duck.object.entity;

import strategy_pattern.duck.algorithm_family.flyimpl.FlyWithWings;
import strategy_pattern.duck.algorithm_family.quckimpl.Squeak;
import strategy_pattern.duck.object.Duck;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super.setFlyBehavior(new FlyWithWings());
        super.setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("红头鸭子");
    }
}
