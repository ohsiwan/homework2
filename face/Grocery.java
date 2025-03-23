package face;

class Grocery extends Product {
    public Grocery(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 2000;  // 식료품의 할인 금액
    }
}
