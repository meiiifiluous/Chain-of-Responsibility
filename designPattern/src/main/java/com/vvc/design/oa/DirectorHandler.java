package com.vvc.design.oa;

/**
 * 总监处理者
 */
public class DirectorHandler implements Handler {
    private boolean isRequestHandled = false;
    @Override
    public void handleRequest(String name, int days) {
        if (days <= 7) {
            System.out.println(name + "，中心总监已经同意您的请假审批");
            isRequestHandled = true;
        }
    }

    @Override
    public boolean isRequestHandled() {
        return isRequestHandled;
    }
}

