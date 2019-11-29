package shopping.base;

/**
 * 食品
 */
public class Food extends Goods {

    public Food(String gnumber, String name, double price) {
        super(gnumber, name, price);
    }

    public Food(String name, double price) {
        super(name, price);
    }
}
