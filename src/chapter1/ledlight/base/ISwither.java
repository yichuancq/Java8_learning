package chapter1.ledlight.base;


/**
 * 转化器
 */
public interface ISwither<T extends  BaseDevice> {

    /**
     * 开关
     *
     * @param t
     * @return
     */
    boolean sw(T t);

}
