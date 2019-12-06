package chapter1.ledlight;

import chapter1.ledlight.base.ControlTypeEnum;
import chapter1.ledlight.base.LightColorEnum;
import chapter1.ledlight.control.LightAdjusterImpl;
import org.junit.Test;

public class MyLightTest {

    @Test
    public void TestLight() {

        /***松下(Panasonic)led人体感应喂奶小夜灯**/
        MyLight myLight = new MyLight("HLT0237", "Panasonic", "松下(Panasonic)led人体感应喂奶小夜灯", false);

        LightAdjusterImpl lightAdjuster = new LightAdjusterImpl(myLight, ControlTypeEnum.SENSITIVE, LightColorEnum.WHITE);
        // switcher
        if (!myLight.isWorkingFlag()) {
            boolean flag = myLight.sw(myLight);
            System.out.println("" + flag);
        }
        //加大档位
        lightAdjuster.changeDegree(myLight, 1);
        //加大档位
        lightAdjuster.changeDegree(myLight, 1);
        //加大档位
        lightAdjuster.changeDegree(myLight, 1);
        //加大档位
        lightAdjuster.changeDegree(myLight, 1);
        //加大档位
        lightAdjuster.changeDegree(myLight, 1);
        //加大档位
        lightAdjuster.changeDegree(myLight, 1);
        //减小档位
        lightAdjuster.changeDegree(myLight, -1);

        lightAdjuster.changeDegree(myLight, -1);
        lightAdjuster.changeDegree(myLight, -1);
        lightAdjuster.changeDegree(myLight, -1);

        /**小米人体感应喂奶小夜灯***/
        MyLight myLight2 = new MyLight("HLT0238", "XiaoMi", "小米触摸喂奶小夜灯", false);

        lightAdjuster = new LightAdjusterImpl(myLight2, ControlTypeEnum.TOUCH, LightColorEnum.GREEN);
        //加大档位
        lightAdjuster.changeDegree(myLight2, 1);
        //加大档位
        lightAdjuster.changeDegree(myLight2, 1);
        //加大档位
        lightAdjuster.changeDegree(myLight2, 1);
        //减小档位
        lightAdjuster.changeDegree(myLight2, -1);
    }

}
