package hello_spring2.core.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);

}
