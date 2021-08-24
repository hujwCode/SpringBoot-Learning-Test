package com.example.thymeleafdemo.action;

public interface DTOConvert<S,T> {
    T convert(S s);
}