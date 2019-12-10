package chapter4.playerlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MusicTest {

    @Test
    public void test() {

        MusicInfo musicInfo1 = new MusicInfo("AA", "", null, "");
        MusicInfo musicInfo2 = new MusicInfo("BB", "", null, "");
        List<MusicInfo> musicInfos = new ArrayList<>();
        //添加到集合
        musicInfos.add(musicInfo1);
        musicInfos.add(musicInfo2);

        //
        IOpItemFactory item1 = new MusicItemImpl();
        MusicInfoList<IOpItemFactory> musicInfoList = new MusicInfoList();


        musicInfoList.setMusicInfos(musicInfos);
        musicInfoList.share(item1, 2);
        musicInfoList.download(item1, 1);

        ///
        System.out.println("============");
        HistoryInfo historyInfo1 = new HistoryInfo("CC", "", null, 0.32);
        HistoryInfo historyInfo3 = new HistoryInfo("DD", "", null, 0.32);

        List<HistoryInfo<? extends HistoryItemImpl>> historyInfos = new ArrayList<>();
        //添加到集合
        historyInfos.add(historyInfo1);
        historyInfos.add(historyInfo3);
        IOpItemFactory historyItem = new HistoryItemImpl();
        HistoryInfoList historyInfoList = new HistoryInfoList();
        historyInfoList.setMusicInfos(historyInfos);

        historyInfoList.share(historyItem, 1);

    }
}
