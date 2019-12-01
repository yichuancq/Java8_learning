package chapter1.device.controller;


import chapter1.device.Device;
import chapter1.device.interf.ICotroller;

/**
 * 遥控器基类
 */
public class BaseController<T extends Device> implements ICotroller<T> {

    public BaseController() {
        System.out.println("BaseController...");
    }

    @Override
    public void fun1(T t) {

    }

    @Override
    public void fun2(T t) {

    }

    @Override
    public void fun3(T t) {

    }

}
