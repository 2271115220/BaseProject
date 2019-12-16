package com.zhd.life.baseproject.base;

/**
 * baseactivity和basefragment继承这个接口
 */
public interface IBaseView {
    /**
     * 默认的加载动画
     */
    void showLoadDialog();

    /**
     * 关闭加载动画
     */
    void hideLoadingDialog();

}
