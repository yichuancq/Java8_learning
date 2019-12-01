package chapter1.generic.dealwith;

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
     * @param dealWithFruit
     */
    public static void fun1(DealWithFruit<? extends Fruit> dealWithFruit) {
        System.out.println("fun1..." + dealWithFruit.getFruit().getName());
    }

    /**
     * @param dealWithFruit
     */
    public static void fun2(DealWithFruit<? super Fruit> dealWithFruit) {
        System.out.println("fun2..." + dealWithFruit.getFruit().getName());
    }

    /**
     * @param dealWithFruit
     * @param <T>
     */
    public static <T extends Fruit> void fun3(DealWithFruit<? extends Fruit> dealWithFruit) {
        System.out.println("fun3..." + dealWithFruit.getFruit().getName());
    }

    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }

}
