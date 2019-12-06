package chapter2.designpattern.abstractfactory;

public class GirlFactory extends AbstractFactory {
    @Override
    public IEat funEat() {
        return new GirlEat();
    }

    @Override
    public ISleep funSleep() {
        return new GirlSleep();
    }
}
