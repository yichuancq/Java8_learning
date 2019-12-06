package chapter2.designpattern.singleton;

import org.junit.Test;

public class TestSingleton {

    @Test
    public void test() {


        /**
         * 用途
         * 保证一个类仅有一个实例， 并提供一个访问它的全局访问点。让类自身负责保存它的唯一实例。
         * 这个类可以保证没有其他实例可以被创建（通过截取创建新对象的请求 ）， 并且它可以提供一个访问该实例的方法
         *
         * 实例
         * 在一部电影中，导演的作用是至关重要的，通常一部电影只有一个总导演。在电影的拍摄过程中，可能会设计多个片场，
         * 导演需要对不同的演员进行分别指导，但所有演员导演都是同一个人，“把导演叫过来” 这个过程可以视为单例模式获取实例的过程
         *
         * 使用场景
         * 在一个系统中，要求一个类有且仅有一个对象，如果出现多个对象就会出现“不良反应”，可以采用单例模式，具体的场景如下：
         *
         * 1要求生成唯一序列号的环境
         *
         * 2在整个项目中需要一个共享访问点或共享数据，例如一个Web页面上的计数器，可以不用把每次刷新都记录到数据库中，
         * 使用单例模式保持计数器的值，并确保是线程安全的
         *
         * 3创建一个对象需要消耗的资源过多，如要访问IO和数据库等资源
         *
         * 4需要定义大量的静态常量和静态方法（如工具类）的环境，可以采用单例模式（当然，也可以直接声明为static的方式）
         *
         */
        //懒汉模式单例
        LazySingleton lazySingleton = LazySingleton.getInstance();

        Object object = lazySingleton.getClass();
        System.out.println(object);
        //饿汉模式单例
        EagerSingle eagerSingle = EagerSingle.getInstance();
        System.out.println(eagerSingle.getClass());

        //Double Check Lock单例模式
        DCLSingleton dclSingleton = DCLSingleton.getInstance();
        System.out.println(dclSingleton.getClass());


    }

}
