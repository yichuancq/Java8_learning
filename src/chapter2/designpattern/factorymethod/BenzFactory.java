package chapter2.designpattern.factorymethod;

public class BenzFactory implements CarFactory {
    @Override
    public void productCar() {
        System.out.println("生产奔驰汽车");
    }
}
