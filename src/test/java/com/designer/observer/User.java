package com.designer.observer;

/**
 * @类名：User
 * @描述：
 * @创建人 xlb
 * @创建时间 2018/11/13 16:02
 * @Version 1.0
 */
public class User implements Observer{
    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
