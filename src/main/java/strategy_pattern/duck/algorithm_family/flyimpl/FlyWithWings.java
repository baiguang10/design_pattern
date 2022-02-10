package strategy_pattern.duck.algorithm_family.flyimpl;

import strategy_pattern.duck.algorithm_family.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("御风而行");
    }
}
