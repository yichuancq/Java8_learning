package chapter1.remotecontroller.controller;

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
