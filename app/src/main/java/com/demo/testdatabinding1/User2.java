package com.demo.testdatabinding1;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;

import com.demo.testdatabinding1.BR;


/**
 * 通过继承BaseObservable 实现对象改变通知UI
 * Created by hp on 2016/6/2.
 */
public class User2 extends BaseObservable {
    private String myName = null;
    private int age = 0;

    public User2(String myName, int age) {
        this.myName = myName;
        this.age = age;
    }

    @Bindable
    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
        notifyPropertyChanged(BR.myName);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
