package HomeWork004;

public class Main {
    public static void App() {
        Buyer[] byers = new Buyer[]{Buyer.NINA, Buyer.PETR};
        for (Buyer buy : byers) System.out.println(buy);

        Product[] products = new Product[]{Product.BEER, Product.BREAD, Product.BUTTER, Product.SAUSAGE, Product.MILK};
        for (Product prod : products) System.out.println(prod);

        Order[] orders = new Order[5];

        orders[0] = makePurchase("Nina Smith", "Хлеб", 11);
        orders[1] = makePurchase("Nina Smith", "Молоко", 10);
        orders[2] = makePurchase("Nina Smith", "Пиво", 12);
        orders[3] = makePurchase("Petr Snow", "Масло", 13);
        orders[4] = makePurchase("Petr Snow", "Колбаса", 14);

        int count = 1;
        for (Order or : orders) {
            System.out.println(count + " " + or);
            count++;
        }
        //С ошибками
        orders[4] = makePurchase("Petr Snow", "Колбаса", 102);
        System.out.println(orders[4]);

        orders[4] = makePurchase("Petr Snow", "Спутник", 1);
        orders[4] = makePurchase("Error Error", "Колбаса", 14);

    }

    public static Order makePurchase(String name, String nameProd, int value) {
        Buyer buyer = null;
        Product product = null;
        try {
            for (Buyer buy : Buyer.values())
                if (name.equals(buy.getFullName())) buyer = buy;

            if (buyer == null) throw new CustomerException("Нет такого покупателя!");
            for (Product prod : Product.values())
                if (nameProd.equals(prod.getName())) product = prod;

            if (product == null) throw new ProductException("Нет такого товара!");
            if (value < 1 || value > 100) throw new AmountException("Не верное количество!", value);
        } catch (CustomerException e) {
            throw new RuntimeException(e);
        } catch (ProductException e) {
            return null;
        } catch (AmountException e) {
            System.out.println("Количество указано с ошибкой, покупаем 1 единицу!");
            return new Order(buyer, product, 1);
        }
        return new Order(buyer, product, value);
    }
}

