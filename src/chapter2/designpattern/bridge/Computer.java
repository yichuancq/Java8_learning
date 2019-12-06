package chapter2.designpattern.bridge;


// 电脑类型+　获得　品牌的引用
//抽象类接口维护对行为实现（implementation）的引用。它的角色就是桥接类。
public class Computer {

    protected Brand brand;
    //
    public Computer(Brand b) {
        this.brand = b;
    }

    public void sale() {
        brand.sale();
    }
}