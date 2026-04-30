package com.fyfe.observer.asyc;

public interface Subject {
    /**
     * 注册观察者的能力
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 删除一个具体的观察者
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 一旦发生了观察的行为，应该通知所有的观察者
     */
    void notifyObservers();
}