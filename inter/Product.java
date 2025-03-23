package inter;

abstract class Product implements Promotion {
    String name;
    int price;
    int weight;

    // 생성자
    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    // 상품 가격에 대한 할인 금액을 반환
    @Override
    public abstract int getDiscountAmount();
}