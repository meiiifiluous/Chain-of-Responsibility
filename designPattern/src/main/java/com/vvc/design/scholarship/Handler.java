package com.vvc.design.scholarship;

import org.w3c.dom.ls.LSException;

import java.util.List;

public interface Handler {
    List<StudentDto> handleRequest(List<StudentDto> studentDto);
}
