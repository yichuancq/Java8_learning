package chapter1.ledlight.control;

import chapter1.ledlight.base.BaseDevice;

public class LightDegree<T extends BaseDevice, E extends Integer> {
    //
    private int degree = 0;
    private T device;
    private E number;

    //max档位
    private int maxDegree = 4;
    //min档位
    private int minDegree = 1;

    public LightDegree(T t, E number) {
        this.device = t;
        this.number = number;
    }

    /**
     * @return
     */
    public int getDegree() {
        if ((int) number > 0) {
            System.out.println("加大档位...");
        } else {
            System.out.println("减小档位...");
        }
        if (this.degree <= maxDegree && this.degree >= this.minDegree) {
            System.out.println("name:" + device.getClass() + ",调节亮度...");
            System.out.println("degree:" + this.degree);
            return degree;
        }
        if (this.degree < this.minDegree) {
            System.out.println("name:" + device.getName() + ",调节超出最小档位范围...");
            this.degree = this.minDegree;
            System.out.println("degree:" + this.degree);
        }
        if (this.degree > this.maxDegree) {
            System.out.println("name:" + device.getName() + ",调节超出最大档位范围...");
            this.degree = this.maxDegree;
            System.out.println("degree:" + this.degree);
        }
        return degree;
    }
}