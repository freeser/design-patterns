package com.fyfe.builder;

/**
 * 创建者设计模式（Builder Design Pattern）可以实现不可变对象，即一旦创建完成，对象的状态就不能改变。
 * 这有助于保证对象的线程安全和数据完整性。
 * 下面是一个使用创建者设计模式实现的不可变对象的Java示例：
 */

public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final String address;

    private ImmutablePerson(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public ImmutablePerson build() {
            return new ImmutablePerson(this);
        }
    }
}