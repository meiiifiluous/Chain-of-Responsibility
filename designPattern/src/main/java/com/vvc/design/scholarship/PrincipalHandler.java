package com.vvc.design.scholarship;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrincipalHandler implements Handler {
    private List<StudentDto> students = new ArrayList<>();

    @Override
    public List<StudentDto> handleRequest(List<StudentDto> studentDtos) {
        //过滤出小黑子
        List<StudentDto> blackStudents = studentDtos.stream()
                .filter(studentDto -> studentDto.getName().contains("小黑子"))
                .collect(Collectors.toList());
        for (StudentDto studentDto : blackStudents) {
            System.out.println(studentDto.getName() + "院长拒绝了你的奖学金申请！因为你是小黑子!");
        }
        studentDtos.removeAll(blackStudents);
        students.addAll(studentDtos);
        for (StudentDto studentDto : students) {
            System.out.println(studentDto.getName() + "恭喜获得奖学金!");
        }
        return students;
    }
}
