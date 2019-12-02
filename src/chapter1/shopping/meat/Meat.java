package chapter1.shopping.meat;

import chapter1.shopping.base.Food;

public class Meat extends Food {
    public Meat(String gnumber, String name, double price) {
        super(gnumber, name, price);
    }

    public Meat(String name, double price) {
        super(name, price);
    }
}
