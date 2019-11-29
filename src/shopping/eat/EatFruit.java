package shopping.eat;

import shopping.base.Goods;
import shopping.fruit.Fruit;

/**
 * @param <T>
 */
public class EatFruit<T extends Fruit> {

    private T something;

    public T getSomething() {
        return something;
    }

    public void setSomething(T something) {
        this.something = something;
    }
    /**
     * @param eatFruit
     */
    public static void eatFruit(EatFruit<? extends Fruit> eatFruit) {
        System.out.println(eatFruit.getSomething());
    }

    /**
     * @param eatGoods
     */
    public static void eatGoods(EatFruit<? extends Goods> eatGoods) {
        System.out.println(eatGoods.getSomething());
    }

    public static void func(EatFruit<? super Fruit> eatFruit) {
        System.out.println(eatFruit.getSomething());
    }

}

