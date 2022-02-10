package strategy_pattern.duck.algorithm_family.quckimpl;

import strategy_pattern.duck.algorithm_family.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子不能叫");
    }
}
