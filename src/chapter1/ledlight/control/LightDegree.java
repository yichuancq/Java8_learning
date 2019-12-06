package chapter1.ledlight.control;

import chapter1.ledlight.base.BaseDevice;

public class LightDegree<T extends BaseDevice, E extends Integer> {
    //设置为静态变量
    private int degree = 0;
    private T device;
    private E number;
    //max档位
    private int maxDegree = 4;
    //min档位
    private int minDegree = 1;

    /**
     * @param t
     * @param number
     * @param degree
     */
    public LightDegree(T t, E number, int degree) {
        this.device = t;
        this.number = number;
        this.degree = degree;
    }
    /**
     * @return
     */
    public int getDegree() {

        this.degree += (int) number;
        //
        this.print();
        //
        this.normal();
        //
        this.checkMin();
        //
        this.checkMax();
        //return value
        return degree;
    }

    /**
     * 调节超出最大档位范围
     *
     * @return
     */
    private int checkMax() {
        if (this.degree > this.maxDegree) {
            System.out.println("name:" + device.getName() + ",调节超出最大档位范围...");
            this.degree = this.maxDegree;
            System.out.println("degree:" + this.degree);
        }
        return degree;
    }

    /**
     * 调节超出最小档位范围
     *
     * @return
     */
    private int checkMin() {
        if (this.degree < this.minDegree) {
            System.out.println("name:" + device.getName() + ",调节超出最小档位范围...");
            this.degree = this.minDegree;
            System.out.println("degree:" + this.degree);
        }
        return degree;
    }

    /**
     * @return
     */
    private int normal() {
        if (this.degree <= maxDegree && this.degree >= this.minDegree) {
            System.out.println("name:" + device.getName() + ",调节亮度...");
            System.out.println("degree:" + this.degree);
        }
        return degree;
    }

    private void print() {
        if ((int) number > 0) {
            System.out.println("加大档位...");
        } else {
            System.out.println("减小档位...");
        }
    }


}