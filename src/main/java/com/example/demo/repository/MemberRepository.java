package com.example.demo.repository;

import com.example.demo.model.Member;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class MemberRepository extends AbstractRepository<Member> {

    @Override
    public Integer create(Member entity) {
        super.memberMap.put(entity.getId(), entity);
        return entity.getId();
    }

    @Override
    public Optional<Member> read(Integer id) {
//        return memberMap
//                .values()
//                .stream()
//                .map(Member::getId)

        return Optional.empty();

    }

    @Override
    public List<Member> read() {
        return List.of();
    }

    @Override
    public Integer update(Member entity) {
        return 0;
    }

    @Override
    public void delete(Member entity) {

    }
}
