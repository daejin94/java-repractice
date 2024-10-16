package com.example.demo.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@ToString
@FieldDefaults(level = AccessLevel.PROTECTED, makeFinal = true)
@RequiredArgsConstructor
public class Human {
    Integer id;
    String name;
    Boolean isDeleted;
}
