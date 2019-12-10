package chapter4.playerlist;

public class HistoryItemImpl<T> implements IOpItemFactory<baseItemInfo> {



    public HistoryItemImpl() {
    }

    @Override
    public void subscribe(baseItemInfo baseItemInfo) {

    }

    @Override
    public void download(baseItemInfo baseItemInfo) {

    }

    @Override
    public void share(baseItemInfo baseItemInfo) {

        System.out.println("历史分享" + baseItemInfo.getClass());
    }

    @Override
    public void detach(baseItemInfo baseItemInfo) {

    }

    @Override
    public <T> T orderBy(T t) {
        return null;
    }
}
