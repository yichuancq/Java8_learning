package chapter1.shopping.fruit;

import chapter1.shopping.base.Food;

/***
 *  水果
 */
public class Fruit extends Food {

    public Fruit(String gnumber, String name, double price) {
        super(gnumber, name, price);
    }

    public Fruit(String name, double price) {
        super(name, price);
    }
}
