package chapter1.tv;

import chapter1.tv.controller.TVRemoteController;
import chapter1.tv.controller.TVRemoteController2;

/**
 * 电视机设备
 *
 * @param <T>
 */
public class TV<T extends Device> extends Device<T> {

    //电视机的遥控器
    private TVRemoteController tvRemoteController;
    private TVRemoteController2 tvRemoteController2;

    public TVRemoteController2 getTvRemoteController2() {
        return tvRemoteController2;
    }

    public void setTvRemoteController2(TVRemoteController2 tvRemoteController2) {
        this.tvRemoteController2 = tvRemoteController2;
    }

    //
    public TV(String name, boolean workingFlag) {
        super(name, workingFlag);
    }

    public TVRemoteController getTvRemoteController() {
        return tvRemoteController;
    }

    public void setTvRemoteController(TVRemoteController tvRemoteController) {
        this.tvRemoteController = tvRemoteController;
    }

    public static void fun1(TV<? extends Device> tv) {
        System.out.println(tv.getName());
    }

    public static void fun2(TV<? super Device> tv) {
        System.out.println(tv.getName());
    }

}
