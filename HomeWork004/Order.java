package HomeWork004;

public class Order {
    private Buyer buyer;
    private Product product;
    private int value;

    public Order(Buyer buyer, Product product, int value) {
        this.buyer = buyer;
        this.product = product;
        this.value = value;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Product getProduct() {
        return product;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Order{" +
                "buyer=" + buyer +
                ", product=" + product +
                ", value=" + value +
                '}';
    }
}
