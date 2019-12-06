package chapter2.designpattern.singleton;

public class LazySingleton {
    //懒汉模式单例
    //比较懒，在类加载时不创建实例，因此类加载熟读快，但运行时获取对象速度慢
    private static LazySingleton instance;//静态私有成员，没有初始化

    private LazySingleton() {
        //私有构造函数
    }

    public static synchronized LazySingleton getInstance() {//静态、同步、公开访问
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
