package chapter2.designpattern.abstractfactory;

public class GirlSleep implements ISleep {
    @Override
    public void sleep() {
        System.out.println("girl sleep...");
    }
}
