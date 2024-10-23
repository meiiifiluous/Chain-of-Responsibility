package com.vvc.design.oa;

/**
 * 组长处理者
 */
public class PMHandler implements Handler {
    private boolean isRequestHandled = false;
    @Override
    public void handleRequest(String name, int days) {
        if (days <= 3) {
            System.out.println(name +"，组长已经同意您的请假审批!");
            isRequestHandled = true;

        }
    }
    @Override
    public boolean isRequestHandled() {
        return isRequestHandled;
    }
}
