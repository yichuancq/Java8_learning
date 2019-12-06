package chapter1.ledlight.control;

import chapter1.ledlight.base.BaseDevice;
import chapter1.ledlight.base.ControlTypeEnum;
import chapter1.ledlight.base.LightColorEnum;
import chapter1.tv.Light;

public abstract class AbstractAdjusterImpl<T extends BaseDevice> implements IAdjuster<T> {
    //控制类型
    private ControlTypeEnum controlTypeEnum;
    // 颜色
    private LightColorEnum lightColorEnum;
    private int degree = 0;


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
        //
        LightDegree lightDegree = new LightDegree(t, number, degree);
        degree = lightDegree.getDegree();
        return degree;

    }
}
