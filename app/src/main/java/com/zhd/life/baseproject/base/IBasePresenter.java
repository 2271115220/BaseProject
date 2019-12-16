package com.zhd.life.baseproject.base;

public interface IBasePresenter<T extends IBaseMVPView> {

    // 绑定View
    void attachView(T view);

    // 解绑View  防止内存溢出，及始终持有Activity
    void deteachView();

    // 取消网络
    void cancelNet();

}
