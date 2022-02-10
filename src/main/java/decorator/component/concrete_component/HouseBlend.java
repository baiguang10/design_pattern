package decorator.component.concrete_component;

import decorator.component.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
