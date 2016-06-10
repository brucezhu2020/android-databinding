package com.demo.testdatabinding1;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.demo.testdatabinding1.databinding.ActivityMainBinding;

import java.io.BufferedReader;

/**
 *
 *
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setHandlers(this);


    }

    public void onClickButton(View view){

        switch (view.getId()){
            case R.id.but1:
                startActivity(new Intent(this,BindingDataActivity.class));
                break;
            case R.id.but2:
                startActivity(new Intent(this,BindingEventActivity.class));
                break;
            case R.id.but3:
                startActivity(new Intent(this,ChangeObjActivity.class));
                break;
            default:
                break;
        }


    }


}
