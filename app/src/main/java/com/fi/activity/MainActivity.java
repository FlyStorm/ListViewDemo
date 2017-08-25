package com.fi.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    //声明控件
    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();

    }

    private void initListener() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    private void initView() {
        //实例化控件对象
        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
//                Toast.makeText(this,"btn1",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,SimpleListViewActivity.class));
                break;
            case R.id.btn2:
//                Toast.makeText(this,"btn2",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,CustomListViewActivity.class));
                break;
            default:
                break;
        }
    }
}
