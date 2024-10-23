package com.vvc.design.scholarship;

import java.util.ArrayList;
import java.util.List;

public class CounselorHandler implements Handler{
    private List<StudentDto> students = new ArrayList<>();

    @Override
    public List<StudentDto> handleRequest(List<StudentDto> studentDtos) {
         for (StudentDto studentDto:studentDtos) {
             if (studentDto.getScore() > 60) {
                 System.out.println(studentDto.getName() + "辅导员同意了您的讲学金申请！成绩达标！");
                 students.add(studentDto);
             } else {
                 System.out.println(studentDto.getName() + "辅导员拒绝您的奖学金申请！成绩未达到标准");
             }
         }
         return students;
    }
}
