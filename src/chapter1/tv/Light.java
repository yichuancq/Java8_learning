package chapter1.tv;

import chapter1.tv.controller.LightRemoteControler;

public class Light<T extends Device> extends Device<T> {

    private LightRemoteControler lightRemoteControler;

    public Light(String name, boolean workingFlag) {
        super(name, workingFlag);
    }

    public LightRemoteControler getLightRemoteControler() {
        return lightRemoteControler;
    }

    public void setLightRemoteControler(LightRemoteControler lightRemoteControler) {
        this.lightRemoteControler = lightRemoteControler;
    }
}
