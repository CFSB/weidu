package com.bw.movie.ui.movie.model;

/**
 * @author BySevenGroup_zwj
 * @create 2018/9/2 21:48
 * @Description
 */
public interface InteractorCallBack<T> {

    void getDataCallBackSuc(T bean);

    void getDataCallBackFai(String errMsg);
}