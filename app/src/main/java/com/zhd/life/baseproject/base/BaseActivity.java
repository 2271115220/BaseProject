package com.zhd.life.baseproject.base;

import android.os.Bundle;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 *
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        initView();
        initListener();
        initData();
    }

    /**
     * 获取布局id
     *
     * @return
     */
    public abstract int getLayoutID();

    /**
     * 初始化view,我们自定义的view，或者需要定义出来的属性
     */
    public abstract void initView();

    /**
     * 请求数据
     */
    public abstract void initData();

    /**
     * 绑定回调监听
     */
    public abstract void initListener();

    /**
     * 默认的加载动画
     */
    public void showLoadDialog() {

    }

    /**
     * 关闭加载动画
     */
    public void hideLoadingDialog() {

    }

    /**
     * 状态栏相关
     */
    public void initStatusBar() {
    }
}
