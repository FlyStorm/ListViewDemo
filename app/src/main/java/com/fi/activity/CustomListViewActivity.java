package com.fi.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.fi.adapter.FruitAdapter;
import com.fi.view.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建者     yangyanfei
 * 创建时间   2017/8/25 0025 19:00
 * 作用	      定制ListView界面
 * 内容：左边显示图片，右边显示文本
 * <p/>
 * 版本       $$Rev$$
 * 更新者     $$Author$$
 * 更新时间   $$Date$$
 * 更新描述   ${TODO}
 */
public class CustomListViewActivity extends Activity {
    //创建水果的集合对象
    private List<Fruit> mFruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_listview);

        //初始化水果数据
        initFruits();
        ListView listView= (ListView) findViewById(R.id.listview2);
        FruitAdapter adapter=new FruitAdapter(this,R.layout.fruit_item,mFruitList);
        //设置适配器
        listView.setAdapter(adapter);

        //设置ListView的点击事件
        //ListView的滚动毕竟只是满足了我们视觉的效果，可是如果ListView中的子项不能点击的话，这个控件就没有什么实际的用途了。
        //使用setOnItemClickListener方法来为ListView注册一个监听器。当用户点击了ListView的任何一个子项时就会回调onItemClick()方法。
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(CustomListViewActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {
        Fruit apple1=new Fruit(R.drawable.g1,"apple1");
        mFruitList.add(apple1);
        Fruit apple2=new Fruit(R.drawable.g2,"apple2");
        mFruitList.add(apple2);
        Fruit apple3=new Fruit(R.drawable.g3,"apple3");
        mFruitList.add(apple3);
        Fruit apple4=new Fruit(R.drawable.g4,"apple4");
        mFruitList.add(apple4);
        Fruit apple5=new Fruit(R.drawable.g5,"apple5");
        mFruitList.add(apple5);
        Fruit apple6=new Fruit(R.drawable.g6,"apple6");
        mFruitList.add(apple6);
        Fruit apple7=new Fruit(R.drawable.g7,"apple7");
        mFruitList.add(apple7);
        Fruit apple8=new Fruit(R.drawable.g8,"apple8");
        mFruitList.add(apple8);
        Fruit apple9=new Fruit(R.drawable.g9,"apple9");
        mFruitList.add(apple9);
        Fruit apple10=new Fruit(R.drawable.g10,"apple10");
        mFruitList.add(apple10);
        Fruit apple11=new Fruit(R.drawable.g1,"apple1");
        mFruitList.add(apple11);
        Fruit apple12=new Fruit(R.drawable.g2,"apple2");
        mFruitList.add(apple12);
        Fruit apple13=new Fruit(R.drawable.g3,"apple3");
        mFruitList.add(apple13);
        Fruit apple14=new Fruit(R.drawable.g4,"apple4");
        mFruitList.add(apple14);
        Fruit apple15=new Fruit(R.drawable.g5,"apple5");
        mFruitList.add(apple15);
    }
}
