package com.example.demo.repository;

import com.example.demo.model.Human;
import com.example.demo.model.Member;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public abstract class AbstractRepository<T extends Human> implements IRepository<T, Integer>{

    protected Map<Integer, T> memberMap;

    public AbstractRepository() {
        memberMap = new HashMap<>();
    }

    public Integer idGenerator() {
        Integer currentMaxInt = memberMap
                .keySet()
                .stream()
                .max(Comparator.comparing(Integer::intValue))
                .orElse(0);
        return currentMaxInt + 1;
    }

    public void current() {
        System.out.println(memberMap);
    }

}
