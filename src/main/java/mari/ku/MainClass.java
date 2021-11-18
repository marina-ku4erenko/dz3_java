package mari.ku;

public class MainClass {
    public static void main(String[] args) {

        Notebook lenovo = new Notebook("Lenovo", "JG-444", 65990);
        lenovo.applyDiscount40();
        lenovo.setRating(5);
        lenovo.setDiagonal(22);
        lenovo.printInfoNotebook();

        Notebook dns = new Notebook("DD-222", 4);
        dns.setBrand("DNS");
        dns.setPrice(32590);
        dns.applyDiscount30();
        lenovo.setDiagonal(23);
        dns.printInfoNotebook();

        Notebook.changeCategory("Tablet");

        Notebook samsung = new Notebook("Samsung", "L-123", 132490);
        samsung.setRating(5);
        samsung.printInfoNotebook();

        Notebook xiaomi = new Notebook("FGH-556D", 3);
        xiaomi.setBrand("Xiaomi");
        xiaomi.setPrice(112990);
        xiaomi.setDiagonal(25);
        xiaomi.applyDiscount40();
        xiaomi.setRating(4);
        xiaomi.printInfoNotebook();
    }
}
