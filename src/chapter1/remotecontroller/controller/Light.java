package chapter1.remotecontroller.controller;

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
