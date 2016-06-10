package com.demo.testdatabinding1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.demo.testdatabinding1.databinding.ActivityChangeObjBinding;

/**
 *
 *监听绑定对象的改变，当对象发生改变自动刷新UI
 *
 */
public class ChangeObjActivity extends AppCompatActivity {
    private ActivityChangeObjBinding binding = null;
    private User2 user = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_change_obj);
        binding.setHandlers(this);
        user = new User2("测试1",12);
        binding.setUser(user);
    }

    public void onClickBtn(View view){

        Log.e("ChangeObjActivity","**************onClickBtn************");
      //  binding.setUser(new User2("测试改变",13));

        //改变对象的值，ui自动刷新
        user.setMyName("aaaa");
    }


}
