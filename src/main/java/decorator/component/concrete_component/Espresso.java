package decorator.component.concrete_component;

import decorator.component.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }


    @Override
    public double cost() {
        return 3.0;
    }
}
