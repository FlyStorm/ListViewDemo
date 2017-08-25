package com.fi.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * 创建者     yangyanfei
 * 创建时间   2017/8/25 0025 17:48
 * 作用	      ${TODO}
 * <p/>
 * 版本       $$Rev$$
 * 更新者     $$Author$$
 * 更新时间   $$Date$$
 * 更新描述   ${TODO}
 */
public class SimpleListViewActivity extends Activity {
    //声明控件对象
    private ListView listView;
    //准备数据
    private String[] datas={"apple","Banana","cat","dog","monkey","tree","flower","star","stone","sky","water",
            "apple","Banana","cat","dog","monkey","tree","flower","star","stone","sky","water",
            "apple","Banana","cat","dog","monkey","tree","flower","star","stone","sky","water"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_listview);

        //创建适配器对象
        //它是通过泛型来指定要适配的数据类型，然后在构造函数中把要适配的数据传入即可。
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(SimpleListViewActivity.this,android.R.layout.simple_list_item_1,datas);
        //实例化列表控件
        listView= (ListView) findViewById(R.id.listview);
        //设置适配器
        listView.setAdapter(adapter);
    }
}
