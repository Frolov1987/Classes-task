package app;

// Класс-модель товара
public class Product {
    private String name;
    private int quantity;
    private double tariff;
    private double price;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQnty() {
        return quantity;
    }

    public void setQnty(int quantity) {
        this.quantity = quantity;
    }

    public double getTariff() {
        return tariff;
    }

    public void setTariff(double tariff) {
        this.tariff = tariff;
    }
    // Задекларируйте переменные, которые отражают
    // наименование, количество и цену товара.
    // Используйте самый строгий доступ к переменным.
    // Добавьте getters и setters.
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
