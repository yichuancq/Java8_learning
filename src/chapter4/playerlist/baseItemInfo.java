package chapter4.playerlist;

import java.awt.*;

public abstract class baseItemInfo {
    /**
     * 标题
     */
    private String title;
    /**
     * 子标题
     */
    private String subTitle;
    /**
     * 封面图片
     */
    private Image imageHead;

    public baseItemInfo(String title, String subTitle, Image imageHead) {
        this.title = title;
        this.subTitle = subTitle;
        this.imageHead = imageHead;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Image getImageHead() {
        return imageHead;
    }

    public void setImageHead(Image imageHead) {
        this.imageHead = imageHead;
    }
}
