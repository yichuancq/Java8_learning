package chapter2.designpattern.bridge;

import org.junit.Test;

public class TestComputer {

    @Test
    public void test() {

        Computer computer = new Laptop(new Lenovo());
        computer.sale();

        Computer computer2 = new Desktop(new Dell());
        computer2.sale();
//      出售联想
//      出售笔记本
//      出售戴尔
//      出售台式电脑

    }

}
