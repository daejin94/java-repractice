package com.example.demo.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@ToString
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Member extends Human{
    Integer age;
    String email;
    public Member(Integer id, String name, Boolean isDeleted, Integer age, String email){
        super(id, name, isDeleted);
        this.age = age;
        this.email = email;
    }

}
