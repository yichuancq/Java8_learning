package chapter1.device;

import chapter1.device.controller.TVRemoteController;

/**
 * 电视机设备
 *
 * @param <T>
 */
public class TV<T extends Device> extends Device<T> {

    //电视机的遥控器
    private TVRemoteController tvRemoteController;

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
}
