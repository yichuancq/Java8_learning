package chapter1.ledlight.control;

import chapter1.ledlight.base.BaseDevice;

public interface IAdjuster<T extends BaseDevice> {
    /**
     * @param t
     * @return
     */
    int changeDegree(T t, Integer number);
}
