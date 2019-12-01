package chapter1.oop.shopping.eat;

import chapter1.oop.shopping.base.Goods;
import chapter1.oop.shopping.fruit.Fruit;

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
     * 表示只能接受类及其子类的泛型类
     *
     * @param eatFruit
     */
    public static void eatFruit(EatFruit<? extends Fruit> eatFruit) {
        System.out.println(eatFruit.getSomething());
    }

    /**
     * 表示只能接受类及其子类的泛型类
     *
     * @param eatGoods
     */
    public static void eatGoods(EatFruit<? extends Goods> eatGoods) {
        System.out.println(eatGoods.getSomething());
    }

    public static void func(EatFruit<? super Fruit> eatFruit) {
        System.out.println(eatFruit.getSomething());
    }

}

