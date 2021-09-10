package com.example.demo.entity;

public class B extends A {
    String y;

    public B() {
    }

    public B(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    @Override
    String getEntityName() {
        return "This is an entity of type B";
    }
}
