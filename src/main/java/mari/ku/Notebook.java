package mari.ku;

public class Notebook {

    private static String category = "Notebook";
    private String brand;
    private String model;
    private int beforePrice;
    private int afterPrice;
    private int discount;
    private int rating;

    static class Monitor {
        static int diagonal;
    }

    public Notebook(String brand, String model, int beforePrice) {
        this.brand = brand;
        this.model = model;
        this.beforePrice = beforePrice;
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

    public void setPrice(int beforePrice) {
        this.beforePrice = beforePrice;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void applyDiscount(int disc) {
        afterPrice = (beforePrice * (100 - disc)) / 100;
        discount = disc;
    }

    public void printInfoNotebook() {
        System.out.println("Категория товаров: " + category);
        System.out.println("Ноутбук: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Дагональ экрана: " + getDiagonal());
        System.out.println("Цена без скидок: " + beforePrice);
        if (afterPrice == 0) {
            System.out.println("Цена с учётом скидок: " + beforePrice);
        } else {
            System.out.println("Цена с учётом скидок: " + afterPrice);
        }
        System.out.println("Размер применённой скидки: " + discount + "%");
        System.out.println("Рейтинг товара: " + rating + "/5");
        System.out.println();
    }

    public static void changeCategory(String newCategory) {
        category = newCategory;
    }

}
