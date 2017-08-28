package com.listviewdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * 创建者     yangyanfei
 * 创建时间   2017/8/25 0025 17:48
 * 作用	      ListView的简单用法
 * ListView是用于展示大量数据的，那我们就应该先将数据提供好。这些数据可以是从网上下载，也可以是从数据库中读取的，应该视具体的应用程序来决定。
 * 在这里，我们就使用简单的一个datas数组来测试。里面包含了很多名称。
 * 不过，数组中的数据是无法直接传递给ListView的，我们还需要借助适配器来完成。
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
        //android.R.layout.simple_list_item_1作为ListView子项布局的id,这是一个Android内置的布局文件，里面只有一个TextView,可用于简单地显示一段文本。
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(SimpleListViewActivity.this,android.R.layout.simple_list_item_1,datas);
        //实例化列表控件
        listView= (ListView) findViewById(R.id.listview);
        //设置适配器，将构建好的适配器对象传递进去，这样ListView和数据之间的关联就建立完成了
        listView.setAdapter(adapter);
    }
}
