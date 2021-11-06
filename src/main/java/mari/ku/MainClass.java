package mari.ku;

public class MainClass {
    public static void main(String[] args) {

        Notebook samsung = new Notebook();
        samsung.setBrand("Samsung");
        samsung.setModel("GH666-1");
        samsung.setPrice(69990);
        samsung.applyDiscount30();
        samsung.setRating(4);
        samsung.printInfoNotebook();

        Notebook xiaomi = new Notebook();
        xiaomi.setBrand("Xiaomi");
        xiaomi.setModel("LL999-2w");
        xiaomi.setPrice(112990);
        xiaomi.applyDiscount40();
        xiaomi.setRating(5);
        xiaomi.printInfoNotebook();

    }
}
