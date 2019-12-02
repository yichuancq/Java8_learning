package chapter1.ledlight.base;

/**
 * 控制方式
 */
public enum ControlTypeEnum {

    TOUCH("触摸控制", 1),
    SENSITIVE("感应控制", 2),
    OTHER("其他", 3);

    ControlTypeEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }

    // 成员变量
    private int index;
    private String name;

    // 覆盖方法
    @Override
    public String toString() {
        return this.name;
    }
}
