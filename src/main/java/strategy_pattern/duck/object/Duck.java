package strategy_pattern.duck.object;

import strategy_pattern.duck.algorithm_family.QuackBehavior;
import strategy_pattern.duck.algorithm_family.FlyBehavior;

/**
 * 策略模式: 行为族，算法族
 * 设计原则：
 * 1. 抽离变量
 * 2. 面向接口编程，而非面向实现编程
 * 3. 多用组合，少用继承
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    /**
     * 当swim这种行为也有变化的时候可以把它抽离出去
     */
    public void swim() {
        System.out.println("是鸭子都会游泳");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
