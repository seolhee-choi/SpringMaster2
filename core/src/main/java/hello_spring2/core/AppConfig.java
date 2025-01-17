package hello_spring2.core;

import hello_spring2.core.discount.DiscountPolicy;
import hello_spring2.core.discount.FixDiscountPolicy;
import hello_spring2.core.discount.RateDiscountPolicy;
import hello_spring2.core.member.MemberRepository;
import hello_spring2.core.member.MemberService;
import hello_spring2.core.member.MemberServiceImpl;
import hello_spring2.core.member.MemoryMemberRepository;
import hello_spring2.core.order.OrderService;
import hello_spring2.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
