package com.fi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fi.activity.R;
import com.fi.view.Fruit;

import java.util.List;

/**
 * 创建者     yangyanfei
 * 创建时间   2017/8/25 0025 19:12
 * 作用	      ${TODO}
 * <p/>
 * 版本       $$Rev$$
 * 更新者     $$Author$$
 * 更新时间   $$Date$$
 * 更新描述   ${TODO}
 */
public class FruitAdapter extends ArrayAdapter<Fruit> {
    //声明资源id
    private int resourceId;
    public FruitAdapter(Context context, int resource,List<Fruit> list) {
        super(context, resource,list);
        resourceId=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //获取当前项Fruit的实例
        Fruit fruit=getItem(position);
        //使用LayoutInflater来为这个子项加载我们传入的布局
        View view= LayoutInflater.from(getContext()).inflate(resourceId,null);
        ImageView fruitImage= (ImageView) view.findViewById(R.id.fruit_image);
        TextView fruitName= (TextView) view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());
        return view;
    }

}
