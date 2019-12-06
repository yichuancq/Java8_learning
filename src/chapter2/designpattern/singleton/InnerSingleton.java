package chapter2.designpattern.singleton;

public class InnerSingleton {
    private InnerSingleton() {
    }

    public static InnerSingleton getInstance() {
        return InnerSingletonHolder.instance;
    }

    /**
     * 静态内部类
     */
    private static class InnerSingletonHolder {
        private static final InnerSingleton instance = new InnerSingleton();
    }
}
