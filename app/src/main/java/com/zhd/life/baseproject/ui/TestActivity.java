package com.zhd.life.baseproject.ui;

import com.zhd.life.baseproject.R;
import com.zhd.life.baseproject.base.BaseMvpActivity;

public class TestActivity extends BaseMvpActivity<TestPresenter> implements ITestActivityView {

    @Override
    public int getLayoutID() {
        return R.layout.activity_test;
    }

    @Override
    public TestPresenter createPresenter() {
        return new TestPresenter();
    }

    @Override
    public void initView() {
    }

    @Override
    public void initData() {
        mPresenter.test();
    }

    @Override
    public void initListener() {

    }

    public void test() {

    }

}
