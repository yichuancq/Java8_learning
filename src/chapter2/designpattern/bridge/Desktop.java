package chapter2.designpattern.bridge;

//  创建电脑类型
class Desktop extends Computer {

    public Desktop(Brand b) {
        super(b);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("出售台式电脑");
    }
}
