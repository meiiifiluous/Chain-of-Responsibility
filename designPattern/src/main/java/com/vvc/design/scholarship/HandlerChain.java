package com.vvc.design.scholarship;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain implements Handler {
    private List<Handler> handlerList;
    private List<StudentDto> students = new ArrayList<>();

    public HandlerChain() {
        handlerList = new ArrayList<>();
    }

    public HandlerChain addHandler(Handler handler) {
        handlerList.add(handler);
        return this;
    }
    @Override
    public List<StudentDto> handleRequest(List<StudentDto> studentDto) {
        for (Handler handler:handlerList) {
            if (students.isEmpty()) {
                students = handler.handleRequest(studentDto);
            } else {
                students = handler.handleRequest(students);
            }
        }
        return students;
    }
}
