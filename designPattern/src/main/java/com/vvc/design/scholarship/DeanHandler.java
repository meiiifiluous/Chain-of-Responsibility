package com.vvc.design.scholarship;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.vvc.design.scholarship.StudentInfoEnum.CLASS_ONE;
import static com.vvc.design.scholarship.StudentInfoEnum.CLASS_TWO;

public class DeanHandler implements Handler{
    private List<StudentDto> students = new ArrayList<>();

    @Override
    public List<StudentDto> handleRequest(List<StudentDto> studentDtos) {
        //一班的同学成绩在前四名
        List<StudentDto> ClassOneStudents = studentDtos.stream()
                .filter(studentDto -> CLASS_ONE.getClassName().equals(studentDto.getClassName()))
                .sorted(Comparator.comparing(StudentDto::getScore).reversed())
                .limit(4)
                .collect(Collectors.toList());
        //二班的同学成绩前五名
        List<StudentDto> ClassTwoStudents = studentDtos.stream()
                .filter(studentDto -> CLASS_TWO.getClassName().equals(studentDto.getClassName()))
                .sorted(Comparator.comparing(StudentDto::getScore).reversed())
                .limit(5)
                .collect(Collectors.toList());
        for (StudentDto studentDto : ClassOneStudents) {
            System.out.println(studentDto.getName() + "院长同意了您的讲学金申请！因为你是一班的学生，成绩前四！");
        }
        for (StudentDto studentDto : ClassTwoStudents) {
            System.out.println(studentDto.getName() + "院长同意了您的讲学金申请！因为你是二班的学生，成绩前五！");
        }
        students.addAll(ClassOneStudents);
        students.addAll(ClassTwoStudents);
        return students;
    }
}
