package chapter2.designpattern.builder;

/**
 * 国籍
 */
public enum Nationality {

    CHINA("中国"), USA("美国"), JAPAN("日本");
    private String name;

    Nationality(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}