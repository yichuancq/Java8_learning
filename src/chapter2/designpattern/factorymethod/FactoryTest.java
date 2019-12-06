package chapter2.designpattern.factorymethod;

import org.junit.Test;

public class FactoryTest {

    @Test
    public void test() {

        /**
         * 工厂模式两要点：
         *
         * 1.工厂接口是工厂方法模式的核心，与调用者直接交互用来提供产品。
         *
         * 2.工厂实现决定如何实例化产品，是实现扩展的途径，需要有多少种产品，就需要有多少个具体的工厂实现。
         *
         * 适用场景：
         * 1当一个类不知道它所必须创建的对象的类的时候
         * 2当一个类希望由它的子类来指定它所创建的对象的时候
         * 3当类将创建对象的职责委托给多个帮助子类中的某一个， 并且你希望将哪一个帮助子类是代理者这一信息局部化的时候
         */
        // 保时捷工厂生产保时捷
        CarFactory pf = new PorscheFactory();
        pf.productCar();
        // 奔驰工厂生产奔驰
        CarFactory bf = new BenzFactory();
        bf.productCar();
    }

}
