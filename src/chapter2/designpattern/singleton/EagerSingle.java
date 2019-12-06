package chapter2.designpattern.singleton;

public class EagerSingle {
    //饿汉模式单例
    //在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快

    private static EagerSingle single = new EagerSingle();//静态私有成员，已初始化

    private EagerSingle() {
        //私有构造函数
    }

    public static EagerSingle getInstance() {
        //静态，不用同步（类加载时已初始化，不会有多线程的问题）
        return single;
    }
}
