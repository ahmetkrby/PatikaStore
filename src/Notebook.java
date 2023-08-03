public class Notebook extends Product {

    private int ram;
    private String storage;
    private String screenSize;


    public Notebook(int id, double price, double discountRate, int stock, String name, Brand brand, int ram, String storage, String screenSize) {
        super(id, price, discountRate, stock, name, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }
}
