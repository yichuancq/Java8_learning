package chapter1.generic.eat;

import chapter1.oop.shopping.fruit.Fruit;

/**
 * 一个范型接口
 *
 * @param <T>
 */
public interface IMethod<T extends Fruit> {

    //T fruit();

    /**
     * 削水果
     */
    void peelFruit(T fruit);


    /**
     * 吃水果
     *
     * @param fruit
     */
    void eatFruit(T fruit);


    /**
     * 洗水果
     *
     * @param fruit
     */
    void washFruit(T fruit);
}
