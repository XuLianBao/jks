package com.designer.observer;

/**
 * @类名：Observerable
 * @描述：
 * @创建人 xlb
 * @创建时间 2018/11/13 15:58
 * @Version 1.0
 */
public interface ObserverAble {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
