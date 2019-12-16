package com.zhd.life.baseproject.base;

import java.util.ArrayList;
import java.util.List;

public class BasePresenter<T extends IBaseMVPView> implements IBasePresenter<T>{

    protected T mView;

    protected List<String> mSubscriptionList = new ArrayList<>();

    @Override
    public void attachView(T view) {
        this.mView=view;
    }

    @Override
    public void deteachView() {
        this.mView=null;
    }

    @Override
    public void cancelNet() {

    }
}
