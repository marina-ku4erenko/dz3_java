package mari.ku;

public class Notebook {

    String brand;
    String model;
    int price;
    int discount;
    int rating;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void applyDiscount30() {
        price = (price * 70) / 100;
        discount = 30;
    }

    public void applyDiscount40() {
        price = (price * 60) / 100;
        discount = 40;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void printInfoNotebook() {
        System.out.println("Ноутбук: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Цена: " + price);
        System.out.println("Размер применённой скидки: " + discount + "%");
        System.out.println("Рейтинг товара: " + rating + "/5");
        System.out.println("");
    }
}
