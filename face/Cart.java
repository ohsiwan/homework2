package face;

class Cart {
    Product[] products;


    public Cart(Product[] products) {
        this.products = products;
    }


    public int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPrice = 0;


        for (Product product : products) {
            totalWeight += product.weight;
            totalPrice += product.price - product.getDiscountAmount();
        }


        int weightCharge;


        if (totalWeight < 3) {
            weightCharge = 1000;
        } else if (totalWeight < 10) {
            weightCharge = 5000;
        } else {
            weightCharge = 10000;
        }


        int priceCharge = 0;


        if (totalPrice >= 30000 && totalPrice < 100000) {
            priceCharge = 1000;
        } else if (totalPrice >= 100000) {
            priceCharge = 10;
        }


        return weightCharge - priceCharge;
    }
}