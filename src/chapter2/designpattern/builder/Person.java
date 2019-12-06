package chapter2.designpattern.builder;

import java.io.Serializable;

/**
 *
 */
public final class Person implements Serializable {
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.nationality = builder.nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality=" + nationality +
                '}';
    }

    private final String name;
    private final Integer age;
    private final Nationality nationality;

    /**
     * 创建者
     */
    public static class Builder {
        private String name;
        private Integer age;
        private Nationality nationality;

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            if (null == name) {
                throw new IllegalArgumentException("人必须有名字!");
            }
            this.name = name;
            return this;
        }

        public Builder nationality(Nationality nationality) {
            this.nationality = nationality;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
