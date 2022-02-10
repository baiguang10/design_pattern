package strategy_pattern.duck.algorithm_family.quckimpl;

import strategy_pattern.duck.algorithm_family.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子吱吱叫");
    }
}
