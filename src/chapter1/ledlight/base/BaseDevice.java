package chapter1.ledlight.base;

import java.io.Serializable;

/**
 * 设备
 */
public class BaseDevice<T> implements Serializable, ISwither {

    public BaseDevice(String id, String brand, String name, boolean workingFlag) {
        this.id = id;
        this.brand = brand;
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
    public boolean sw(BaseDevice device) {
        //如果机器没有工作，则需要开机
        if (!this.isWorkingFlag()) {
            System.out.println("关机状态下执行开机。。。");
        } else {
            System.out.println("开机状态下执行关机。。。");
        }
        this.setWorkingFlag(!device.isWorkingFlag());
        return true;

    }

    //型号
    private String id;
    //品牌
    private String brand;
    //设备名称
    private String name;
    //是否工作
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", workingFlag=" + workingFlag +
                '}';
    }

}
