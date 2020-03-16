package com.zhd.life.baseproject.base;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zhd.life.baseproject.widget.LoadingDialog;

/**
 * 加载动画，屏幕适配，状态栏，这部分内容放在这里
 */
public abstract class BaseActivity extends AppCompatActivity implements IBaseView {
    public Dialog mLoadingDialog = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        initView();
        initListener();
        initData();
    }


    /**
     * 初始化加载动画，因为并不是每个页面都需要这个东西，因此当需要的时候去加载更合适
     */
    public void initLoadingDialog() {
        if (mLoadingDialog != null) {
            mLoadingDialog = new LoadingDialog(getApplicationContext());
        }
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
     * 状态栏相关
     */
    public void initStatusBar() {
    }

    @Override
    public void showLoadDialog() {
        if (mLoadingDialog != null) {
            mLoadingDialog.show();
        }
    }

    @Override
    public void hideLoadingDialog() {
        if (mLoadingDialog != null) {
            mLoadingDialog.dismiss();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mLoadingDialog != null) {
            mLoadingDialog = null;
        }
    }

    /**
     * 设置全屏显示
     */
    protected void isFullScreen() {
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

    }
}
