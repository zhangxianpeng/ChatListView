package com.example.administrator.chatlistview;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView)findViewById(R.id.lv_chatview);
        ChatItemListViewBean bean1 = new ChatItemListViewBean();
        bean1.setType(0);
        bean1.setIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher));
        bean1.setText("Hello,how are you?");

        ChatItemListViewBean bean2 = new ChatItemListViewBean();
        bean2.setType(1);
        bean2.setIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher));
        bean2.setText("Fine thank you ,and you ?");

        ChatItemListViewBean bean3 = new ChatItemListViewBean();
        bean3.setType(0);
        bean3.setIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher));
        bean3.setText("i am fine too?");

        ChatItemListViewBean bean4 = new ChatItemListViewBean();
        bean4.setType(1);
        bean4.setIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher));
        bean4.setText("ByeBye");

        ChatItemListViewBean bean5 = new ChatItemListViewBean();
        bean5.setType(0);
        bean5.setIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher));
        bean5.setText("ByeBye");

        List<ChatItemListViewBean> data = new ArrayList<ChatItemListViewBean>();
        data.add(bean1);
        data.add(bean2);
        data.add(bean3);
        data.add(bean4);
        data.add(bean5);
        mListView.setAdapter(new ChatItemListViewAdapter(this,data));

    }

}
