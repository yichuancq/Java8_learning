package chapter2.designpattern.bridge;

import org.junit.Test;

public class TestComputer {

    @Test
    public void test() {

        /**
         * 桥接的用意是：将抽象与实现解耦，使得二者可以独立变化，像我们常用的JDBC桥DriverManager一样，JDBC进行连接数据库的时候，在各个数据库之间进行切换，
         * 基本不需要动太多的代码，甚至丝毫不用动，原因就是JDBC提供统一接口，每个数据库提供各自的实现，用一个叫做数据库驱动的程序来桥接就行了。
         */
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
