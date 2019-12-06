package chapter2.designpattern.adapter;

/**
 * 这个司机有急事，必须马上赶往公司，可是只借到了一辆公共汽车，
 * 并且车上没有任何人，现在必须马上将司机的驾驶小汽车的技能转化成驾驶公共汽车的技能
 */
public class BusAdapter implements Car {

    private Bus bus;

    public BusAdapter() {
        this.bus = new Bus();
    }

    @Override
    public void drive() {
        bus.run();
    }
}