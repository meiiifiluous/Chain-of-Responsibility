package com.vvc.design.oa;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain implements Handler {
    private List<Handler> handlerList;
    private boolean isRequestHandled = false;
    public HandlerChain() {
        this.handlerList = new ArrayList<>();
    }

    public HandlerChain addHandler(Handler handler) {
        handlerList.add(handler);
        return this;
    }

    @Override
    public void handleRequest(String name, int days) {
        for (Handler handler : handlerList) {
            handler.handleRequest(name, days);
            if (handler.isRequestHandled() == true) {
                isRequestHandled = true;
                break;
            }
        }
    }

    @Override
    public boolean isRequestHandled() {
        return isRequestHandled;
    }
}
