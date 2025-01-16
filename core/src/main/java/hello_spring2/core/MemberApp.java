package hello_spring2.core;

import hello_spring2.core.member.Grade;
import hello_spring2.core.member.Member;
import hello_spring2.core.member.MemberService;
import hello_spring2.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = "+ findMember.getName());

    }
}
