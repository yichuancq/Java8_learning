package shopping.meat;

import shopping.base.Food;

public class Meat extends Food {
    public Meat(String gnumber, String name, double price) {
        super(gnumber, name, price);
    }

    public Meat(String name, double price) {
        super(name, price);
    }
}
