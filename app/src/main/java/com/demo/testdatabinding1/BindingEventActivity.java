package com.demo.testdatabinding1;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.demo.testdatabinding1.databinding.ActivityBindingDataBinding;
import com.demo.testdatabinding1.databinding.ActivityBindingEventBinding;
/**
 *
 *事件绑定
 *
 */
public class BindingEventActivity extends AppCompatActivity {

    private static final String TAG = BindingEventActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBindingEventBinding bingding = DataBindingUtil.setContentView(this,R.layout.activity_binding_event);
       //绑定事件必须设置监听的类，点击事件可以写在任意类
      // 系统会根据 variable的 name属性值自动生成set方法
        bingding.setHandlers(this);
    }



   public void onClickButton1(View view){

       Log.e(TAG,"****************onClickButton1*******************");
       Toast.makeText(this,"点击了按钮1",Toast.LENGTH_SHORT).show();

   }
    public void onClickButton2(View view){

        Log.e(TAG,"****************onClickButton2*******************");
        Toast.makeText(this,"点击了按钮2",Toast.LENGTH_SHORT).show();

    }

}
