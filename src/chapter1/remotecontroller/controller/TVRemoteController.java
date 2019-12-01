package chapter1.remotecontroller.controller;

public class TVRemoteController extends BaseController<Device> {


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
}

