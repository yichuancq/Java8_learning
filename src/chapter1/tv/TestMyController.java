package chapter1.tv;

import chapter1.tv.controller.LightRemoteControler;
import chapter1.tv.controller.TVRemoteController2;
import org.junit.Test;

public class TestMyController {


    @Test
    public void fun() {

        TV tv = new TV("tv", false);
        boolean flag = false;
        //
        //TVRemoteController tvRemoteController = new TVRemoteController();
        TVRemoteController2 tvRemoteController2 = new TVRemoteController2();
//      tv.setTvRemoteController(tvRemoteController);
        tv.setTvRemoteController2(tvRemoteController2);
        if (!tv.isWorkingFlag() && (tv instanceof Device)) {
            //开机
            flag = tv.sw(tv);
            System.out.println("flag:" + flag);
        }
        //开机状态才能切换频道
//        if (tv.isWorkingFlag()) {
//            tvRemoteController2.fun1(tv);
//            tvRemoteController2.fun2(tv);
//            tvRemoteController2.fun3(tv);
//        }
        if (tv.isWorkingFlag() && (tv instanceof Device)) {
            tvRemoteController2.fun1(tv);
            tvRemoteController2.fun2(tv);
            tvRemoteController2.fun3(tv);
        }
        //
        tvRemoteController2.fun4(tv);
        //
        tvRemoteController2.fun5(tv);
        //关机
        flag = tv.sw(tv);
        System.out.println("flag:" + flag);


        TV.fun1(tv);

        TV.fun2(tv);
    }

    @Test
    public void testLight() {
        Light light = new Light("电灯", false);
        boolean flag = false;
        LightRemoteControler lightRemoteControler = new LightRemoteControler();
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
