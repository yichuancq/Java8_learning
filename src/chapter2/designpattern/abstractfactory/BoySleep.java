package chapter2.designpattern.abstractfactory;

public class BoySleep implements ISleep {
    @Override
    public void sleep() {
        System.out.println("boy sleep...");
    }
}
