package chapter1.ledlight.control;

import chapter1.ledlight.base.BaseDevice;
import chapter1.ledlight.base.ControlTypeEnum;
import chapter1.ledlight.base.LightColorEnum;

public class LightAdjusterImpl<T extends BaseDevice> extends AbstractAdjusterImpl<BaseDevice> {

    public LightAdjusterImpl(T t, ControlTypeEnum controlTypeEnum, LightColorEnum lightColorEnum) {
        super(t, controlTypeEnum, lightColorEnum);
    }

}
