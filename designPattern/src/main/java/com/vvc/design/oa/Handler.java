package com.vvc.design.oa;

public interface Handler {
    public abstract void handleRequest(String name, int days);

    boolean isRequestHandled();
}
