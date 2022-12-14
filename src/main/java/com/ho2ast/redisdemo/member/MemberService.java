package com.ho2ast.redisdemo.member;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    @Cacheable(cacheNames = "member")
    public List<Member> listMember() {
        return memberRepository.findAll();
    }

    @Cacheable(value="getbyName", key = "#name")
    public Member memberById(String name) {
        return memberRepository.findById(name).get();
    }
}
