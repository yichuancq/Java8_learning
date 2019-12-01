package chapter1.oop.shopping.vegetable;

/**
 * 西红柿
 */
public class Tomato extends Vegetable {
    public Tomato(String gnumber, String name, double price) {
        super(gnumber, name, price);
    }

    public Tomato(String name, double price) {
        super(name, price);
    }
}
