package chapter4.playerlist;

import java.awt.*;

/**
 * 音乐播放列表
 */
public class MusicInfo<E extends MusicItemImpl> extends baseItemInfo {
    /**
     * 当前播放进度时间
     */
    private String currentPlayTime = "";

    public MusicInfo(String title, String subTitle, Image imageHead, String currentPlayTime) {
        super(title, subTitle, imageHead);
        this.currentPlayTime = currentPlayTime;
    }

    public String getCurrentPlayTime() {
        return currentPlayTime;
    }

    public void setCurrentPlayTime(String currentPlayTime) {
        this.currentPlayTime = currentPlayTime;
    }

    /**
     * @param e
     */
    public void share(E e) {
        e.share(this);
    }

    /**
     * @param e
     */
    public void download(E e) {
        e.share(this);
    }

}
