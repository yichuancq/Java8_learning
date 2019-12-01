package chapter1.remotecontroller;

import chapter1.remotecontroller.controller.Light;
import chapter1.remotecontroller.controller.LightRemoteControler;
import chapter1.remotecontroller.controller.TV;
import chapter1.remotecontroller.controller.TVRemoteController;
import org.junit.Test;

public class TestMyController {


    @Test
    public void fun() {

        TV tv = new TV("TV", false);
        boolean flag = false;
        //
        TVRemoteController tvRemoteController = new TVRemoteController();

        tv.setTvRemoteController(tvRemoteController);

        if (!tv.isWorkingFlag()) {
            //开机
            flag = tv.sw(tv);
            System.out.println("flag:" + flag);
        }
        //开机状态才能切换频道
        if (tv.isWorkingFlag()) {
            tvRemoteController.fun1(tv);
            tvRemoteController.fun2(tv);
            tvRemoteController.fun3(tv);
        }
        //关机
        flag = tv.sw(tv);
        System.out.println("flag:" + flag);
    }

    @Test
    public void testLight() {
        Light light = new Light("电灯", false);
        boolean flag = false;
        LightRemoteControler lightRemoteControler=new LightRemoteControler();
        //
        light.setLightRemoteControler(lightRemoteControler);

        if (!light.isWorkingFlag()) {
            flag = light.sw(light);
            System.out.println("flag:" + flag);
        }
        if (light.isWorkingFlag()) {
            lightRemoteControler.fun1(light);
            lightRemoteControler.fun2(light);
            lightRemoteControler.fun3(light);
        }
        //关机
        flag = light.sw(light);
        System.out.println("flag:" + flag);

    }

}
