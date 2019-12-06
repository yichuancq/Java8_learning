package chapter2.designpattern.bridge;

public class Lenovo implements Brand {
    @Override
    public void sale() {
        System.out.println("出售联想");
    }
}
