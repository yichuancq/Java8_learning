package chapter4.playerlist;

import java.awt.*;

/**
 * 播放历史
 */
public class HistoryInfo<E extends IOpItemFactory> extends baseItemInfo {

    /**
     * 已经播放进度
     */
    private double process = 0.00;

    public HistoryInfo(String title, String subTitle, Image imageHead) {
        super(title, subTitle, imageHead);
    }

    public HistoryInfo(String title, String subTitle, Image imageHead, double process) {
        super(title, subTitle, imageHead);
        this.process = process;
    }

    public double getProcess() {
        return process;
    }

    public void setProcess(double process) {
        this.process = process;
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
