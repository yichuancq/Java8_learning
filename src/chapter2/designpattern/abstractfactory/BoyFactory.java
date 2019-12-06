package chapter2.designpattern.abstractfactory;

/**
 * 继承抽象工厂类，实现BOY的吃和睡觉
 */
public class BoyFactory extends AbstractFactory {


    @Override
    public IEat funEat() {
        return new BoyEat();
    }

    @Override
    public ISleep funSleep() {
        return new BoySleep();
    }
}
