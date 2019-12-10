package chapter4.playerlist;

/**
 *
 */
public class MusicItemImpl<T> implements IOpItemFactory<baseItemInfo> {

    public MusicItemImpl() {
    }

    @Override
    public void subscribe(baseItemInfo baseItemInfo) {
        System.out.println("订阅音乐");
    }

    @Override
    public void download(baseItemInfo baseItemInfo) {
        System.out.println("下载音乐" + baseItemInfo.getClass());
    }

    @Override
    public void share(baseItemInfo baseItemInfo) {
        System.out.println("分享音乐" + baseItemInfo.getClass());
    }

    @Override
    public void detach(baseItemInfo baseItemInfo) {
        System.out.println("移除");
    }

    /**
     * @param t
     * @param <T>
     * @return
     */
    @Override
    public <T> T orderBy(T t) {
        return t;
    }
}
