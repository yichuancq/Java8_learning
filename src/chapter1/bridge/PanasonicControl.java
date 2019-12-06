package chapter1.bridge;

import chapter1.ledlight.base.BaseDevice;
import chapter1.ledlight.base.ControlTypeEnum;
import chapter1.ledlight.base.LightColorEnum;
import chapter1.ledlight.control.AbstractAdjusterImpl;

public class PanasonicControl extends AbstractAdjusterImpl<BaseDevice> {

    public PanasonicControl(BaseDevice baseDevice, ControlTypeEnum controlTypeEnum, LightColorEnum lightColorEnum) {
        super(baseDevice, controlTypeEnum, lightColorEnum);
    }

    @Override
    public int changeDegree(BaseDevice baseDevice, Integer number) {

        return super.changeDegree(baseDevice, number);
    }
}
