package chapter1.tv.controller;

import chapter1.tv.Device;

//op+enter ->import package
//ctr+enter-> imp

/**
 * 继承抽象类
 */
public class TVRemoteController2 extends AbstractController<Device> {

    @Override
    public void fun1(Device device) {
        System.out.println(device.getName() + "\t切换频道1...");
    }

    @Override
    public void fun2(Device device) {
        System.out.println(device.getName() + "\t切换频道2...");
    }

    @Override
    public void fun3(Device device) {
        System.out.println(device.getName() + "\t切换频道3...");
    }


    /**
     * 实现抽象方法
     *
     * @param device
     */
    @Override
    public void fun4(Device device) {

        System.out.println(device.getName() + "\t音量++");
    }

    /**
     * 实现抽象方法
     *
     * @param device
     */
    @Override
    public void fun5(Device device) {
        System.out.println(device.getName() + "\t音量--");

    }
}
