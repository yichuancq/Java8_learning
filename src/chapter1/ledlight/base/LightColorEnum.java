package chapter1.ledlight.base;

/**
 * 灯光颜色
 */
public enum LightColorEnum {
    RED("红色", 1),
    GREEN("绿色", 2),
    WHITE("白色", 3);
    private LightColorEnum(String name, int index) {
        this.index = index;
        this.name = name;
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
