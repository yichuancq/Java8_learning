package chapter1.generic;

import chapter1.generic.eat.DealWithFruit;
import chapter1.oop.shopping.fruit.Apple;
import chapter1.oop.shopping.fruit.Banana;
import chapter1.oop.shopping.fruit.Fruit;
import org.junit.Test;

public class TestFruit {


    @Test
    public void testDealWithFruit() {
        System.out.println("testDealWithFruit....");

        Apple apple = new Apple("G1001", "苹果", 11.2);
        //
        Banana banana = new Banana("G1002", "梨子", 5);

        DealWithFruit dealWithFruit1 = new DealWithFruit<Fruit>(apple);

        System.out.println(dealWithFruit1.getFruit());
        //洗苹果
        dealWithFruit1.washFruit(apple);
        //削苹果
        dealWithFruit1.peelFruit(apple);
        //吃苹果
        dealWithFruit1.eatFruit(apple);

        DealWithFruit dealWithFruit2 = new DealWithFruit<Fruit>(banana);

        System.out.println(dealWithFruit2.getFruit());
        //
        dealWithFruit2.washFruit(banana);
        //剥香蕉
        dealWithFruit2.peelFruit(banana);
        //吃香蕉
        dealWithFruit2.eatFruit(banana);
        //
        Fruit fruit = new Fruit("G002", "水果", 12.22);
        // fruit 的父类水果
        DealWithFruit dealWithFruit3 = new DealWithFruit<Fruit>(fruit);

        // 方法带范型参数
        DealWithFruit.fun1(dealWithFruit1);
        //
        DealWithFruit.fun2(dealWithFruit2);
        ///
        DealWithFruit.fun1(dealWithFruit3);
        DealWithFruit.fun2(dealWithFruit3);
    }
}
