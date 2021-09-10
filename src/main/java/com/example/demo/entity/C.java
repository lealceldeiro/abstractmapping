package com.example.demo.entity;

public class C extends A {
    String z;

    public C() {
    }

    public C(String x, String z) {
        this.x = x;
        this.z = z;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    @Override
    String getEntityName() {
        return "This is an entity of type C";
    }
}
