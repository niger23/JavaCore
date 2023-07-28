package HomeWork004;

public enum Product {
    BREAD ("Хлеб", 31),
    MILK ("Молоко", 70),
    BEER ("Пиво", 50),
    BUTTER ("Масло", 100),
    SAUSAGE ("Колбаса", 250);

    private String name;
    private int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
