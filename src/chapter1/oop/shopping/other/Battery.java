package chapter1.oop.shopping.other;

import chapter1.oop.shopping.base.Goods;

/**
 * 电池
 */
public class Battery extends Goods {

    //电压
    private double voltage;

    public Battery(String name, double price) {
        super(name, price);
    }

    public Battery(String gnumber, String name, double price) {
        super(gnumber, name, price);
    }

    public Battery(String gnumber, String name, double price, double voltage) {
        super(gnumber, name, price);
        this.voltage = voltage;
    }


    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    /**
     * 重写父方法
     *
     * @return
     */
    @Override
    public String toString() {
        return "Battery{" + super.toString() +
                "电压=" + voltage +
                '}';
    }

//    @Override
//    public boolean isEatable(boolean isEatable) {
//        return false;
//    }
}
