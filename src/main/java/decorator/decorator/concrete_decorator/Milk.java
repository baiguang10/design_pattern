package decorator.decorator.concrete_decorator;

import decorator.component.Beverage;
import decorator.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Milk";
    }
}
