package face;

class LargeAppliance extends Product {
    public LargeAppliance(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 0;  // 대형 가전은 할인 금액 없음
    }
}
