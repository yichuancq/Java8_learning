package chapter1.generic;

import chapter1.generic.eat.Eat;
import chapter1.generic.eat.EatFruit;
import chapter1.oop.shopping.base.Goods;
import chapter1.oop.shopping.fruit.Apple;
import chapter1.oop.shopping.fruit.Banana;
import chapter1.oop.shopping.fruit.Fruit;

public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple("G1001", "苹果", 11.2);
        Eat<Apple> eat = new Eat<>(apple);
        System.out.println("吃：" + eat.getSomething());

        Fruit fruit = new Fruit("G002", "水果", 12.22);

        Goods goods = new Goods("G003", "Goods", 12.2);
        //
        Banana banana = new Banana("G1002", "梨子", 5);
        Eat<Fruit> eat1 = new Eat<>(banana);
        System.out.println("吃：" + eat1.getSomething());
        //
        Eat<? extends Banana> eat3 = new Eat<>(banana);
        System.out.println("吃：" + eat3.getSomething());

        Eat<? extends Fruit> eat4 = new Eat<>(fruit);
        System.out.println("吃：" + eat4.getSomething());
        //
        Eat<? extends Fruit> eat5 = new Eat<>(apple);
        System.out.println("吃：" + eat5.getSomething());

        //编译成功
        Eat<? super Goods> eat2 = new Eat<>(banana);
        System.out.println("吃：" + eat2.getSomething());

        //下界通配符
        Eat<? super Fruit> eat6 = new Eat<Goods>(banana);
        System.out.println("吃：" + eat6.getSomething());

        /**
         *
         */
        EatFruit eatFruit = new EatFruit();
        //ok
        eatFruit.setSomething(banana);

        System.out.println(eatFruit.getSomething());
        //ok
        eatFruit.setSomething(fruit);
        //Error:(48, 31) java: 不兼容的类型: chapter1.oop.shopping.base.Goods无法转换为shopping.fruit.Fruit
//        eatFruit.setSomething(goods);
        System.out.println(eatFruit.getSomething());
        //
        EatFruit<? super Fruit> eatFruit1 = new EatFruit<>();
        eatFruit1.setSomething(apple);
        //
        eatFruit.eatFruit(eatFruit1);
        eatFruit.eatGoods(eatFruit1);
        eatFruit.func(eatFruit1);
        //

        EatFruit<? super Banana> eatFruit2 = new EatFruit<>();
        eatFruit2.setSomething(banana);
        eatFruit.eatFruit(eatFruit2);
        eatFruit.eatGoods(eatFruit2);
    }


}
