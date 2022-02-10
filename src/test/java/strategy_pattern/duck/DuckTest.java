package strategy_pattern.duck;
import org.junit.Test;
import strategy_pattern.duck.algorithm_family.flyimpl.FlyNoWay;
import strategy_pattern.duck.algorithm_family.quckimpl.MuteQuack;
import strategy_pattern.duck.object.entity.RedheadDuck;

public class DuckTest {
    @Test
    public void duckTest() {
        RedheadDuck duck = new RedheadDuck();
        duck.performFly(); // 御风而行
        duck.performQuack(); // 鸭子吱吱叫

        System.out.println("behavior change");
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new MuteQuack());
        duck.performFly(); // 御风而行
        duck.performQuack(); // 鸭子吱吱叫
    }
}
