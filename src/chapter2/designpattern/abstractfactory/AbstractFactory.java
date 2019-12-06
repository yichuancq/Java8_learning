package chapter2.designpattern.abstractfactory;

public abstract class AbstractFactory {

    /**
     * 吃东西
     *
     * @return
     */
    public abstract IEat funEat();

    /**
     * 睡觉
     *
     * @return
     */
    public abstract ISleep funSleep();
}
