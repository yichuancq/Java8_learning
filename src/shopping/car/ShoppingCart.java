package shopping.car;

import java.util.ArrayList;
import java.util.List;

/**
 * 购物车
 */
public class ShoppingCart {

    //  private List<? extends Goods> orderList = new ArrayList<>();
    //存放商品
    private List<Order> orderList = new ArrayList<>();


    /**
     * 加入购物车
     *
     * @param order
     */
    public void put(Order order) {
        orderList.add(order);
    }


    /**
     *
     */
    public void printInfo() {
        for (Order order : orderList) {
            System.out.println(
                    "货号:" + order.getGoods().getGnumber() + "\t商品名称: " + order.getGoods().getName() +
                            "\tprice:" + order.getGoods().getPrice()
                            + "\tamount:" + order.getAmount());
        }
    }

    /**
     * 结账
     *
     * @return
     */
    public double payMoney() {
        double money = 0;
        for (Order order : orderList) {
            money += order.getGoods().getPrice() * order.getAmount();
        }
        return money;
    }
}
