package hello_spring2.core.discount;

import hello_spring2.core.member.Grade;
import hello_spring2.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;

        }
    }
}
