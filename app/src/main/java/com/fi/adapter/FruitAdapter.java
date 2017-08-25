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
        //View view= LayoutInflater.from(getContext()).inflate(resourceId,null);

        //提升ListView的运行效率
        //因为在FruitAdapter的getView方法中每次都将布局重新加载一遍，当ListView快速滚动时性能就比较差
        //convertView这个参数是将之前加载好的布局进行缓存，以便之后可以重用。
        //我们在getView方法中进行了判断，如果convertView为空，则使用LayoutInflater加载布局，如果不为空则直接对convertView进行重用。
        //这样就大大提高了ListView的运行效率，在快速滚动的时候也可以表现出更好的性能。
        View view;
        ViewHolder viewHolder;
        if (convertView==null){
            view= LayoutInflater.from(getContext()).inflate(resourceId,null);
            viewHolder=new ViewHolder();
            viewHolder.fruitImage= (ImageView) view.findViewById(R.id.fruit_image);
            viewHolder.fruitName= (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);
        }else {
            view=convertView;
            viewHolder= (ViewHolder) view.getTag();
        }
        /*ImageView fruitImage= (ImageView) view.findViewById(R.id.fruit_image);
        TextView fruitName= (TextView) view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());*/
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        return view;
    }
    //每次在getView方法中还是会调用View的findViewById方法来获取一次控件的实例。可以使用ViewHolder进行性能优化。
    //新增一个内部类ViewHolder,用于对控件的实例进行缓存。当convertView为空的时候，创建一个ViewHolder对象，并将控件的实例都存放在ViewHolder里，然后
    //调用View的setTag方法，将ViewHolder对象存储在View中。当convertView不为空的时候，则调用View的getTag方法，把ViewHolder重新取出来。这样所有的控件都
    //缓存在了ViewHolder里，就没有必要每次都通过findViewById方法来获取控件实例。
    class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
    }

}
