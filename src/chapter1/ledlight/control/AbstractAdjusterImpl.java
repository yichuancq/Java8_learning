package chapter1.ledlight.control;

import chapter1.ledlight.base.BaseDevice;
import chapter1.ledlight.base.ControlTypeEnum;
import chapter1.ledlight.base.LightColorEnum;

public abstract class AbstractAdjusterImpl<T extends BaseDevice> implements IAdjuster<T> {
    //控制类型
    private static ControlTypeEnum controlTypeEnum;
    // 颜色
    private static LightColorEnum lightColorEnum;
    //max档位
    private Integer maxDegree = 4;
    //min档位
    private Integer minDegree = 1;
    //
    private Integer degree = 0;

    public AbstractAdjusterImpl(T t, ControlTypeEnum controlTypeEnum, LightColorEnum lightColorEnum) {
        this.controlTypeEnum = controlTypeEnum;
        this.lightColorEnum = lightColorEnum;
        System.out.println("device:" + t.toString());
        System.out.println("设备颜色:" + lightColorEnum.toString());
        System.out.println("控制方式:" + controlTypeEnum.toString());
    }

    /**
     * 调节亮度
     *
     * @param t
     * @param number
     * @return
     */
    @Override
    public int changeDegree(T t, Integer number) {
        this.degree += number;
        if (number > 0) {
            System.out.println("加大档位...");
        } else {
            System.out.println("减小档位...");
        }
        if (this.degree <= this.maxDegree && this.degree >= this.minDegree) {
            System.out.println("name:" + t.getName() + ",调节亮度...");
            System.out.println("degree:" + this.degree);
            return this.degree;
        }
        if (this.degree < this.minDegree) {
            System.out.println("name:" + t.getName() + ",调节超出最小档位范围...");
            this.degree = this.minDegree;
            System.out.println("degree:" + this.degree);
        }
        if (this.degree > this.maxDegree) {
            System.out.println("name:" + t.getName() + ",调节超出最大档位范围...");
            this.degree = this.maxDegree;
            System.out.println("degree:" + this.degree);
        }
        return this.degree;
    }
}
