package chapter1.tv.controller;

import chapter1.tv.Device;

public class LightRemoteControler extends BaseController<Device> {

    @Override
    public void fun1(Device device) {
        System.out.println(device.getName() + "\t亮度1档...");
    }

    @Override
    public void fun2(Device device) {
        System.out.println(device.getName() + "\t亮度2档...");
    }

    @Override
    public void fun3(Device device) {
        System.out.println(device.getName() + "\t亮度3档...");
    }
}
