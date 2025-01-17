package hello_spring2.core;

import hello_spring2.core.member.Grade;
import hello_spring2.core.member.Member;
import hello_spring2.core.member.MemberService;
import hello_spring2.core.member.MemberServiceImpl;
import hello_spring2.core.order.Order;
import hello_spring2.core.order.OrderService;
import hello_spring2.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();
//        MemberService memberService = new MemberServiceImpl();
//        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = "+ order);

    }
}
