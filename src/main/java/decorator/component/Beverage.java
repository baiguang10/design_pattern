package decorator.component;

/**
 * @author sky-bai
 */
public abstract class Beverage {
     protected String description = "Unknown Beverage";

    /**
     *  添加商品描述
     * @return the description of bulk
     */
     public String getDescription() {
         return description;
     }

    /**
     *  计算花费的钱
     * @return the money
     */
     public abstract double cost();
}
