package chapter1.tv.controller;

import chapter1.tv.Device;
import chapter1.tv.interf.ICotroller;

/**
 * 自定义抽象类
 *
 * @param <T>
 */
public abstract class AbstractController<T extends Device> implements ICotroller<T> {

    @Override
    public void fun1(T t) {

    }

    @Override
    public void fun2(T t) {

    }

    @Override
    public void fun3(T t) {

    }

    //抽象方法1
    public abstract void fun4(T t);

    //抽象方法2
    public abstract void fun5(T t);
}
