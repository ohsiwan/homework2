package face;

public class Main {
    public static void main(String[] args) {
        // 각 상품 객체 생성
        Product beauty = new Beauty("beauty", 30000, 2);
        Product grocery = new Grocery("grocery", 20000, 3);
        Product largeAppliance = new LargeAppliance("largeAppliance", 50000, 5);

        // 장바구니 객체 생성
        Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});

        // 배송비 계산
        int totalDeliveryCharge = cart.calculateDeliveryCharge();

        // 결과 출력
        System.out.println(totalDeliveryCharge);  // 결과: 9000
    }
}