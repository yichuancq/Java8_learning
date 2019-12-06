package chapter2.designpattern.adapter;

/**
 * 司机需要获得一辆小汽车才能进行驾驶
 */
public class Driver implements Car {
    private Car car;

    @Override
    public void drive() {
        car.drive();
    }

    public Driver(Car car) {
        this.car = car;
    }
}