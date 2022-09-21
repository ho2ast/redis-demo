package com.ho2ast.redisdemo.member;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/list")
    public List<Member> list() {
        return memberService.listMember();
    }

    @GetMapping("/memberById")
    public Member memberById(String name) {
        return memberService.memberById(name);
    }

}
