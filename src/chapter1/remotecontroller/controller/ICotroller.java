package chapter1.remotecontroller.controller;

/**
 * 遥控器接口
 */


public interface ICotroller<T extends Device> {

    void fun1(T t);

    void fun2(T t);

    void fun3(T t);
}
