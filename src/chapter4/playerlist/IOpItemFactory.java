package chapter4.playerlist;

public interface IOpItemFactory<T> {

    /**
     * 订阅
     *
     * @param t
     */
    void subscribe(T t);

    /**
     * 下载
     *
     * @param t
     */
    void download(T t);

    /**
     *  分享
     *
     * @param t
     */
    void share(T t);

    /**
     * 移除
     *
     * @param t
     */
    void detach(T t);

    /**
     * 排序
     *
     * @param t
     * @param <T>
     * @return
     */
    <T> T orderBy(T t);
}
