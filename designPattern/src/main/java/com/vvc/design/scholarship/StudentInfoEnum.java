package com.vvc.design.scholarship;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
public enum StudentInfoEnum {
    CLASS_ONE("一班"),
    CLASS_TWO("二班"),
    CLASS_THREE("三班");

    private final String className;

    StudentInfoEnum(String className) {
        this.className = className;
    }

}
