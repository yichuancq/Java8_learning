package shopping.fruit;

import shopping.base.Color;

/**
 * 橘子
 */
public class Orange  extends Fruit {
    private Color color;

    public Orange(String gnumber, String name, double price) {
        super(gnumber, name, price);
    }

    public Orange(String name, double price) {
        super(name, price);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
