package mari.ku;

public class Notebook {

    public static String category = "Notebook";
    private String brand;
    private String model;
    private int price;
    private int discount;
    private int rating;

    static class Monitor {
        static int diagonal;
    }

    public Notebook(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Notebook(String model, int rating) {
        this.model = model;
        this.rating = rating;
    }

    private int getDiagonal() {
        return Monitor.diagonal;
    }

    public void setDiagonal(int diagonal) {
        Monitor.diagonal = diagonal;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void applyDiscount30() {
        price = (price * 70) / 100;
        discount = 30;
    }

    public void applyDiscount40() {
        price = (price * 60) / 100;
        discount = 40;
    }

    public void printInfoNotebook() {
        System.out.println("Категория товаров: " + category);
        System.out.println("Ноутбук: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Дагональ экрана: " + getDiagonal());
        System.out.println("Цена: " + price);
        System.out.println("Размер применённой скидки: " + discount + "%");
        System.out.println("Рейтинг товара: " + rating + "/5");
        System.out.println();
    }

    public static void changeCategory(String newCategory) {
        category = newCategory;
    }

}
