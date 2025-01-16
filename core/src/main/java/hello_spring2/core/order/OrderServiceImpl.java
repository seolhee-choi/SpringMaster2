package hello_spring2.core.order;

import hello_spring2.core.discount.DiscountPolicy;
import hello_spring2.core.discount.FixDiscountPolicy;
import hello_spring2.core.member.Member;
import hello_spring2.core.member.MemberRepository;
import hello_spring2.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);

    }


}
