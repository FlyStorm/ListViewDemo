package com.listviewdemo.view;

/**
 * 创建者     yangyanfei
 * 创建时间   2017/8/25 0025 19:03
 * 作用	      定义一个实体类
 * 两个字段：name表示水果名字，imageId表示水果对应图片的资源id
 * <p/>
 * 版本       $$Rev$$
 * 更新者     $$Author$$
 * 更新时间   $$Date$$
 * 更新描述   ${TODO}
 */
public class Fruit {
    private String name;
    private int imageId;

    public Fruit(int imageId, String name) {
        this.imageId = imageId;
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
