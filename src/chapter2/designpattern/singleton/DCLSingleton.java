package chapter2.designpattern.singleton;

public class DCLSingleton {
    //Double Check Lock单例模式
    //懒汉模式的改进
    //但仍然存在隐患
    private static DCLSingleton instance = null;

    private DCLSingleton() {
    }

    public static DCLSingleton getInstance() {
        if (instance == null) {//第一层判断主要是为了避免不必要的同步
            synchronized (DCLSingleton.class) {
                if (instance == null) {//第二层判空是为了在null情况下创建实例
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
