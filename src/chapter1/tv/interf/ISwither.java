package chapter1.tv.interf;

import chapter1.tv.Device;

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
