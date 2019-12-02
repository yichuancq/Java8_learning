package chapter1.ledlight;

import chapter1.ledlight.base.BaseDevice;
import chapter1.ledlight.control.LightAdjusterImpl;

public class MyLight<T extends BaseDevice> extends BaseDevice<T> {

    private LightAdjusterImpl lightAdjuster;

    public MyLight(String id, String brand, String name, boolean workingFlag) {
        super(id, brand, name, workingFlag);
    }

    public LightAdjusterImpl getLightAdjuster() {
        return lightAdjuster;
    }

    public void setLightAdjuster(LightAdjusterImpl lightAdjuster) {
        this.lightAdjuster = lightAdjuster;
    }

}
