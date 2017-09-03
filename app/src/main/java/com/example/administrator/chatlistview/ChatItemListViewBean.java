package com.example.administrator.chatlistview;

import android.graphics.Bitmap;

/**
 * Created by Administrator on 2017/8/31/031.
 */

public class ChatItemListViewBean {
    private int type;
    private String text;
    private Bitmap icon;
    public  ChatItemListViewBean(){
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Bitmap getIcon() {
        return icon;
    }

    public void setIcon(Bitmap icon) {
        this.icon = icon;
    }
}
