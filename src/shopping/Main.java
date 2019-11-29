package shopping;

import shopping.car.Order;
import shopping.car.ShoppingCart;
import shopping.fruit.Apple;
import shopping.fruit.Banana;
import shopping.fruit.Orange;
import shopping.other.Battery;

public class Main {


    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        Apple apple = new Apple("G1001", "苹果", 11.2);
        apple.isEatable(true);
        //
        //生成订单信息
        Order order1 = new Order(apple, 2);
        System.out.println(order1.showOrder());
        System.out.println("本商品是否可以食用:" + apple.isEatable());
        System.out.println("小记:" + order1.pay());
        /**
         *
         */
        Order order2 = new Order(new Banana("G1002", "梨子", 5), 1);
        System.out.println(order2.showOrder());
        System.out.println("小记:" + order2.pay());
        /**
         *
         */
        Order order3 = new Order(new Orange("G1003", "冰糖橘", 7.5), 1.51);
        System.out.println(order3.showOrder());
        System.out.println("小记:" + order3.pay());
        /**
         *
         */
        Order order4 = new Order(new Orange("G1004", "梨子", 5.5), 0.4);
        System.out.println(order4.showOrder());
        System.out.println("小记:" + order4.pay());//  order4.pay();
        /**
         *
         */
        Order order5 = new Order(new Orange("G1005", "猪肉", 24), 1.5);
        System.out.println(order5.showOrder());
        System.out.println("小记:" + order5.pay());//  order4.pay();
        /**
         *
         * Battery
         */
        Battery battery = new Battery("G1006", "电池", 6.5, 1.5);
        battery.isEatable(false);
        Order order6 = new Order(battery, 1);
        System.out.println(order6.showOrder());
        System.out.println("本商品是否可以食用:" + battery.isEatable());
        System.out.println("小记:" + order6.pay());

        //加入购物车
        shoppingCart.put(order1);
        shoppingCart.put(order2);
        shoppingCart.put(order3);
        shoppingCart.put(order4);
        shoppingCart.put(order5);
        shoppingCart.put(order6);
        //打印购物信息
        shoppingCart.printInfo();
        //总码洋
        double totalMoney = shoppingCart.payMoney();
        //结款
        System.out.println("结款:" + totalMoney);



        //System.out.println("颜色-->" + Color.RED.toString());

    }


}
