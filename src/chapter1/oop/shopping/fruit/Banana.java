package chapter1.oop.shopping.fruit;

/**
 * 香蕉
 */
public class Banana extends Fruit {

    public Banana(String gnumber, String name, double price) {
        super(gnumber, name, price);
    }

    public Banana(String name, double price) {
        super(name, price);
    }
}
