package face;

abstract class Product implements Promotion {
    String name;
    int price;
    int weight;


    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }


    @Override
    public abstract int getDiscountAmount();
}