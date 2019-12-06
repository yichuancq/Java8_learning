package chapter2.designpattern.abstractfactory;

import org.junit.Test;

public class TestChild {

    @Test
    public void testChildMethod() {

        //AbstractFactory实例化不同的工厂
        AbstractFactory factoryBoy = new BoyFactory();
        //AbstractFactory实例化不同的工厂
        AbstractFactory factoryGirl = new GirlFactory();
        //
        factoryBoy.funEat().eat();
        factoryBoy.funSleep().sleep();

        factoryGirl.funEat().eat();
        factoryGirl.funSleep().sleep();

    }
}
