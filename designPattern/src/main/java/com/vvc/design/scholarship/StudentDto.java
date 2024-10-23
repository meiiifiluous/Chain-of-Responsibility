package com.vvc.design.scholarship;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    /**
     * 学号
     */
    private String number;
    /**
     * 姓名
     */
    private String name;
    /**
     * 班级
     */
    private String className;
    /**
     * 成绩
     */
    private Integer score;

    @Override
    public String toString() {
        return super.toString();
    }
}
