package com.vvc.design.oa;

/**
 * 部长处理者
 */
public class MinisterHandler implements Handler {
    private boolean isRequestHandled = false;
    @Override
    public void handleRequest(String name, int days) {
        if (days <= 15) {
            System.out.println(name + "，部长已经同意您的请假审批");
            isRequestHandled = true;
        }
    }
    @Override
    public boolean isRequestHandled() {
        return isRequestHandled;
    }
}
