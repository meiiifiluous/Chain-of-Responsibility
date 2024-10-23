package com.vvc.design.scholarship;

import java.util.ArrayList;
import java.util.List;

public class ScholarshipClient {
    public static void main(String[] args) {
        ArrayList<StudentDto> studentDtos = new ArrayList<>();
        String[] className = {"一班", "二班", "三班"};
        for (int i = 0; i < 100; i++) {
            StudentDto studentDto = new StudentDto("M" + i, "学生" + i, className[(int) Math.random() * 2], (int) Math.round(Math.random() * 100));
            ;
            System.out.println(studentDto);
            studentDtos.add(studentDto);
        }
        studentDtos.add(new StudentDto("x", "小黑子1号", "一班", 100));
        studentDtos.add(new StudentDto("y", "小黑子2号", "二班", 99));
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new CounselorHandler())
                .addHandler(new DepartmentHandler())
                .addHandler(new DeanHandler())
                .addHandler(new PrincipalHandler());
        List<StudentDto> result = handlerChain.handleRequest(studentDtos);
        System.out.println("结果:");
        for (StudentDto studentDto : result){
            System.out.println(studentDto);
        }
    }
}
