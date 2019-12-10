package chapter4.playerlist;

import java.util.ArrayList;
import java.util.List;

public class HistoryInfoList<E extends IOpItemFactory> {


    /**
     *
     */
    private List<HistoryInfo> musicInfos = new ArrayList<>();

    /**
     * 分享音乐
     *
     * @param index
     */
    public void share(E e, int index) {
        funShare(e, index);
    }


    private void funShare(E e, int index) {
        int i = 0;
        for (HistoryInfo historyInfo : musicInfos) {
            i++;
            if (i == index) {
                System.out.println("操作的索引:" + index);
                System.out.println("getClass:" + historyInfo.getClass());
                System.out.println("title:" + historyInfo.getTitle());
                System.out.println("播放进度:" + historyInfo.getProcess());
                e.share(historyInfo);
            }
        }
    }

    public List getMusicInfos() {
        return musicInfos;
    }

    public void setMusicInfos(List musicInfos) {
        this.musicInfos = musicInfos;
    }
}
