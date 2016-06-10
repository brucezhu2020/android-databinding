package com.demo.testdatabinding1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
/**
 *
 *数据绑定
 *
 */
import com.demo.testdatabinding1.databinding.ActivityBindingDataBinding;

public class BindingDataActivity extends AppCompatActivity {

    private static final String TAG = BindingDataActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBindingDataBinding bingding = DataBindingUtil.setContentView(this,R.layout.activity_binding_data);

        //系统自动将对象的值设置到对应的控件
        bingding.setUser(new User("测试1","测试2"));

    }



}
