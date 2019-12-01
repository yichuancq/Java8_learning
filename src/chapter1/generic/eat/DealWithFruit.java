package chapter1.generic.eat;

import chapter1.oop.shopping.fruit.Fruit;

public class DealWithFruit<T extends Fruit> implements IMethod<T> {

    private T fruit;

    public DealWithFruit(T fruit) {
        this.fruit = fruit;
    }

    /**
     * 削水果
     *
     * @param fruit
     */
    @Override
    public void peelFruit(T fruit) {

        System.out.println("削水果...");
        System.out.println(fruit.getName());
    }

    /**
     * 吃水果
     *
     * @param fruit
     */
    @Override
    public void eatFruit(T fruit) {

        System.out.println("吃水果...");
        System.out.println(fruit.getName());
    }

    /**
     * 洗水果
     *
     * @param fruit
     */
    @Override
    public void washFruit(T fruit) {

        System.out.println("洗水果...");
        System.out.println(fruit.getName());
    }

    /**
     * 表示只能接受类及其子类的泛型类
     *
     * @param fruit
     */
    public static void fun1(DealWithFruit<? extends Fruit> fruit) {
        System.out.println("fun1..." + fruit.getFruit().getName());
    }

    /**
     * @param fruit
     */
    public static void fun2(DealWithFruit<? super Fruit> fruit) {
        System.out.println("fun2..." + fruit.getFruit().getName());
    }


    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }

}
