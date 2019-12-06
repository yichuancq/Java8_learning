package chapter1.bridge;

import chapter1.ledlight.MyLight;
import chapter1.ledlight.base.ControlTypeEnum;
import chapter1.ledlight.base.LightColorEnum;
import org.junit.Test;

public class TestLight {

    @Test
    public void test() {


        PanasonicControl panasonicControl;
        XiaoMiControl xiaoMiControl;
        /***松下(Panasonic)led人体感应喂奶小夜灯**/
        MyLight myLight = new MyLight("HLT0237", "Panasonic", "松下(Panasonic)led人体感应喂奶小夜灯", false);

        // switcher
        if (!myLight.isWorkingFlag()) {
            boolean flag = myLight.sw(myLight);
            System.out.println("" + flag);
        }

        panasonicControl = new PanasonicControl(myLight, ControlTypeEnum.SENSITIVE, LightColorEnum.WHITE);
        panasonicControl.changeDegree(myLight, 1);
        panasonicControl.changeDegree(myLight, 1);
        panasonicControl.changeDegree(myLight, 1);
        panasonicControl.changeDegree(myLight, 1);
        /**小米人体感应喂奶小夜灯***/
        MyLight myLight2 = new MyLight("HLT0238", "XiaoMi", "小米触摸喂奶小夜灯", false);
        // switcher
        if (!myLight2.isWorkingFlag()) {
            boolean flag = myLight2.sw(myLight2);
            System.out.println("" + flag);
        }

        xiaoMiControl = new XiaoMiControl(myLight2, ControlTypeEnum.TOUCH, LightColorEnum.GREEN);

        xiaoMiControl.changeDegree(myLight2, 1);
        xiaoMiControl.changeDegree(myLight2, 1);
        xiaoMiControl.changeDegree(myLight2, 1);
        xiaoMiControl.changeDegree(myLight2, 1);


    }
}
