package shopping.base;

/**
 * 商品
 */
public class Goods implements IEatable {
    //货号
    private String gnumber;
    //物品名称
    private String name;
    //单价
    private double price;
    //是否可以食用
    private boolean eatable = false;

    /**
     * 构造函数1
     *
     * @param gnumber
     * @param name
     * @param price
     */
    public Goods(String gnumber, String name, double price) {
        this.name = name;
        this.price = price;
        this.gnumber = gnumber;
    }

    /**
     * 构造函数2
     *
     * @param name
     * @param price
     */
    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public String getGnumber() {
        return gnumber;
    }

    public void setGnumber(String gnumber) {
        this.gnumber = gnumber;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gnumber='" + gnumber + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /***
     * 是否可以食用
     * @param isEatable
     * @return
     */
    @Override
    public boolean isEatable(boolean isEatable) {
        this.eatable = isEatable;
        return this.eatable;
    }
}
