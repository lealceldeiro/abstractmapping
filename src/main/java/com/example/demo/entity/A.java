package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = B.class, name = "B"),
        @JsonSubTypes.Type(value = C.class, name = "C")
})
public abstract class A {
    String x;
    @JsonProperty("entityName")
    abstract String getEntityName();
}
