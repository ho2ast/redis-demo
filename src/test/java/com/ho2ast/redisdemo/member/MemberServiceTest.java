package com.ho2ast.redisdemo.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    MemberService service;

    @Test
    void listMember() {
        List<Member> members = service.listMember();
        for (Member member : members) {
            System.out.println("member = " + member);
        }
        assertThat(members.size()).isEqualTo(5);
    }

//    @Test
//    void memberById() {
//        Member aaa = service.memberById("aaa");
//        assertThat(aaa.getMoney()).isEqualTo(1000);
//    }
}