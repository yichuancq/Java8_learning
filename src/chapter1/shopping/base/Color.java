package chapter1.shopping.base;

/**
 * 颜色
 */
public enum Color {
    RED("红色", 1),
    GREEN("绿色", 2),
    BLANK("白色", 3),
    YELLO("黄色", 4);

    private Color(String name, int index) {
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
