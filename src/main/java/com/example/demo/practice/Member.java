package com.example.demo.practice;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@ToString
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@EqualsAndHashCode // 사용 시 주소 값 비교를 하지 않고, 동등 객체 비교를 진행.
public class Member {
    String name;
    Integer age;
}
