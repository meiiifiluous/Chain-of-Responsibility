package com.vvc.design.scholarship;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DepartmentHandler implements Handler{
    private List<StudentDto> students = new ArrayList<>();

    @Override
    public List<StudentDto> handleRequest(List<StudentDto> studentDtos) {
        for (StudentDto studentDto:studentDtos) {
            if (Objects.equals(StudentInfoEnum.CLASS_ONE.getClassName(),studentDto.getClassName())||Objects.equals(StudentInfoEnum.CLASS_TWO.getClassName(),studentDto.getClassName())) {
                System.out.println(studentDto.getName() + "系主任同意了您的讲学金申请！因为你是一二班的同学！");
                students.add(studentDto);
            } else {
                System.out.println(studentDto.getName() + "系主任拒绝您的奖学金申请！因为你不是一二班的同学");
            }
        }
        return students;
    }
}
