package chapter1.device.interf;

import chapter1.device.Device;

/**
 *
 */
public interface ISwither<T extends Device> {

    /**
     * @param t
     * @return
     */
    boolean sw(T t);


}
