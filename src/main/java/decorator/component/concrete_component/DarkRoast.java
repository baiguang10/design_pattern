package decorator.component.concrete_component;

import decorator.component.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
