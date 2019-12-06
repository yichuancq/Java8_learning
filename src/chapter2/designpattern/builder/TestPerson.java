package chapter2.designpattern.builder;

import org.junit.Test;

public class TestPerson {

    /**
     * 创建者模式 (Builder)
     * <p>
     * 适用场景
     * 1创建一个复杂对象的算法应该独立于组成对象的组成部分以及它们是如何组合的
     * 2构建过程必须为所构造的对象提供不同的表示形式
     */
    @Test
    public void testPerson() {

        /**
         * 避免多个set方法
         */
        Person person = new Person.Builder()
                .name("小明")
                .age(20)
                .nationality(Nationality.CHINA)
                .build();
        System.out.println("person:" + person.toString());


    }

}
