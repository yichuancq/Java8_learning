package chapter1.shopping.car;

import chapter1.shopping.base.Goods;

/**
 * 订单
 */
public class Order {

    //用户购物商品
    private Goods goods;
    //数量
    private double amount;

    public Order(Goods goods, double amount) {
        this.goods = goods;
        this.amount = amount;
    }

    public String showOrder() {
        return goods.toString() + ",数量:" + amount;
    }

    /**
     * 小记
     *
     * @return
     */
    public double pay() {
        return this.getGoods().getPrice() * this.amount;
    }


    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
