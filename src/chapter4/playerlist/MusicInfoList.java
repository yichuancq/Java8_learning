package chapter4.playerlist;

import java.util.ArrayList;
import java.util.List;

/**
 * 音乐节目
 *
 * @param <E>
 */
public class MusicInfoList<E extends IOpItemFactory> {

    /**
     *
     */
    private List<MusicInfo> musicInfos = new ArrayList<>();

    /**
     * 分享音乐
     *
     * @param index
     */
    public void share(E e, int index) {
        funShare(e, index);
    }

    /**
     * 下载音乐
     *
     * @param index
     */
    public void download(E e, int index) {
        funDownLoad(e, index);
    }


    private void funShare(E e, int index) {
        int i = 0;
        for (MusicInfo musicInfo : musicInfos) {
            i++;
            if (i == index) {
                System.out.println("操作的索引:" + index);
                System.out.println("getClass:" + musicInfo.getClass());
                System.out.println("title:" + musicInfo.getTitle());
                e.share(musicInfo);
            }
        }
    }


    private void funDownLoad(E e, int index) {
        int i = 0;
        for (MusicInfo musicInfo : musicInfos) {
            i++;
            if (i == index) {
                System.out.println("操作的索引:" + index);
                System.out.println("getClass:" + musicInfo.getClass());
                System.out.println("title:" + musicInfo.getTitle());
                e.download(musicInfo);
            }
        }
    }

    public List<MusicInfo> getMusicInfos() {
        return musicInfos;
    }

    public void setMusicInfos(List<MusicInfo> musicInfos) {
        this.musicInfos = musicInfos;
    }
}
