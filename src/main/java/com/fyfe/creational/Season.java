package com.fyfe.creational;
// 枚举本身就是一个单例
public enum Season {
    // 这个spring是不是一个单例，是的
    // 对应枚举类，任何一个枚举项就是一个天然的单例
    // 本质上就是static final Season spring = new Season();
    SPRING
}
