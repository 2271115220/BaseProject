package com.zhd.life.baseproject.base;

import android.os.Bundle;

import androidx.annotation.Nullable;

public abstract class BaseMvpActivity<T extends BasePresenter> extends BaseActivity implements IBaseMVPView {
    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mPresenter = createPresenter();
        bindPresenter();
        super.onCreate(savedInstanceState);
    }

    public abstract T createPresenter();

    public void bindPresenter() {
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.deteachView();
            mPresenter = null;
        }
    }
}
