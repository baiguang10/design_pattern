package strategy_pattern.duck.algorithm_family.flyimpl;

import strategy_pattern.duck.algorithm_family.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
