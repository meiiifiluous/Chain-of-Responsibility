package com.vvc.design.oa;

public class OASystem {
    public static void main(String[] args) {
        // 创建具体处理者
        Handler pm = new PMHandler();
        Handler director = new DirectorHandler();
        Handler minister = new MinisterHandler();
        // 构建责任链
        HandlerChain chain = new HandlerChain()
                .addHandler(pm)
                .addHandler(director)
                .addHandler(minister);

        // 使用责任链
        chain.handleRequest("王二", 14);
    }
}
