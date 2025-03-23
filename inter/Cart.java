package inter;

class Cart {
    Product[] products;

    // 생성자
    public Cart(Product[] products) {
        this.products = products;
    }

    // 배송비 계산 메소드
    public int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPrice = 0;

        // 총 무게와 총 가격 계산
        for (Product product : products) {
            totalWeight += product.weight;
            totalPrice += product.price - product.getDiscountAmount();  // 할인 적용된 가격
        }

        // 무게에 따른 배송비 계산
        int weightCharge;

        // 무게에 따른 배송비 조건
        if (totalWeight < 3) {
            weightCharge = 1000;
        } else if (totalWeight < 10) {  // totalWeight >= 3 이므로 이 조건으로만 처리
            weightCharge = 5000;
        } else {
            weightCharge = 10000;
        }

        // 가격에 따른 추가 배송비 계산
        int priceCharge = 0;

        // 가격에 따른 조건 처리
        if (totalPrice >= 30000 && totalPrice < 100000) {
            priceCharge = 1000;
        } else if (totalPrice >= 100000) {
            priceCharge = 10;  // 무료 배송
        }

        // 총 배송비는 무게로 계산된 배송비와 가격에 따른 추가 배송비의 차액
        return weightCharge - priceCharge;  // 가격 할인은 배송비에서 차감
    }
}