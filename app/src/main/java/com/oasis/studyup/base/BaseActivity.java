package com.oasis.studyup.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2016/8/11.
 * Email:yaoxiaochang@gmail.com
 */
public abstract class BaseActivity extends AppCompatActivity{

    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        bindView();
        init(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unBindView();
    }

    private void bindView() {
        unbinder =  ButterKnife.bind(this);
    }

    private void unBindView(){
        if(unbinder != null){
            unbinder.unbind();
        }
    }

    protected abstract void init(Bundle savedInstanceState);

    protected abstract int getLayoutID();

}
