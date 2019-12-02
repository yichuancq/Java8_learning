package chapter1.shopping.vegetable;

import chapter1.shopping.base.Food;

/**
 * 蔬菜
 */
public class Vegetable extends Food {
    public Vegetable(String gnumber, String name, double price) {
        super(gnumber, name, price);
    }

    public Vegetable(String name, double price) {
        super(name, price);
    }
}
