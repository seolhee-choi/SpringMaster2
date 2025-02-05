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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
