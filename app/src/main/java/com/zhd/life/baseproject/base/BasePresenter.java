package com.zhd.life.baseproject.base;

import java.util.ArrayList;
import java.util.List;

public class BasePresenter<T extends IBaseMVP> implements IBasePresenter<T> {

    protected T mView;

    protected List<String> mNetList = new ArrayList<>();

    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    @Override
    public void deteachView() {
        this.mView = null;
        cancelNet();
    }

    /**
     * 取消网络请求
     */
    @Override
    public void cancelNet() {
    }
}
