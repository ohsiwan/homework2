package face;

class Beauty extends Product {
    public Beauty(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 10000;  // 화장품의 할인 금액
    }
}
