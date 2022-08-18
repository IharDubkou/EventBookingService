package org.podpivas.service;

public interface IHandler {
    default void handle() {
        System.out.println(this.getClass());
    }
}
