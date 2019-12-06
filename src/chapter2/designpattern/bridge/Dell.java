package chapter2.designpattern.bridge;


class Dell implements Brand {

    @Override
    public void sale() {
        System.out.println("出售戴尔");
    }
}
