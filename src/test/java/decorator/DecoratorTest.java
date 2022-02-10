package decorator;

import decorator.component.Beverage;
import decorator.component.concrete_component.DarkRoast;
import decorator.component.concrete_component.Espresso;
import decorator.decorator.concrete_decorator.Milk;
import decorator.decorator.concrete_decorator.Mocha;
import decorator.decorator.concrete_decorator.Soy;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.StringBufferInputStream;

public class DecoratorTest {
    @Test
    public void test() {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Espresso();
        beverage2 = new Milk(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
