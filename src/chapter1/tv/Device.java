package chapter1.tv;

import chapter1.tv.interf.ISwither;

import java.io.Serializable;

/**
 * 设备
 */
public class Device<T> implements Serializable, ISwither {


    public Device(String name, boolean workingFlag) {
        this.name = name;
        this.workingFlag = workingFlag;
    }

    /**
     * 自定义开关
     *
     * @param device
     * @return
     */
    @Override
    public boolean sw(Device device) {
        //如果机器没有工作，则需要开机
        if (!this.isWorkingFlag()) {
            System.out.println("关机状态下执行开机。。。");
            this.setWorkingFlag(!device.isWorkingFlag());
            return true;
        } else {
            System.out.println("开机状态下执行关机。。。");
            this.setWorkingFlag(!device.isWorkingFlag());
            return true;
        }
    }

    private String name;
    private boolean workingFlag = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isWorkingFlag() {
        return workingFlag;
    }

    public void setWorkingFlag(boolean workingFlag) {
        this.workingFlag = workingFlag;
    }


    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                '}';
    }


}
