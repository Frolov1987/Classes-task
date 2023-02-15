package app;

public class ProductInfo {

    static String name; // наименование товара
    static int quantity; // количество товара
    static double price; // цена товара
    static double taxRate; // ставка налога, равна 5%
    static Product product; // переменная типа Product
    static double income; // доход
    static double tax; // налог

    public static void main(String[] args){

        // Вызов метода инициализации переменных
        initVars();

        product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setQnty(quantity);
        product.setTariff(taxRate);
        // Установите значения через setters.
        // Здесь ...

        income = calculateIncome( product.getQnty(),product.getPrice());
        // Вызов метода расчета налога
        tax = calculateTax(income, taxRate);
//        income = calculateIncome(/* Здесь получите значения через getters*/);
//        tax = calculateTax(income, taxRate);


        showData();
        // Вызов метода вывода данных
//        showData();
    }

    private static void initVars() {
        name = "Apple";
        quantity = 100;
        price = 1020;
        taxRate = 10;
    }

    //  Метод рассчета дохода
    private static double calculateIncome(int qnty, double price) {
        return qnty * price;
    }

    // Метод рассчета налога
    private static double calculateTax(double income, double taxRate ) {
        return income * taxRate / 100;
    }

    // Метод вывода данных
   private static void showData() {
        System.out.printf("%s%nSold (pcs.): %d%nIncome (USD): %.2f%nTax (USD): %.2f",
                product.getName(), product.getQnty(), income, tax);
    }
}
