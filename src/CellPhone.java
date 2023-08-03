public class CellPhone extends Product {
    private String memory;
    private String screenSize;
    private int batteryPower;
    private int ram;
    private String color;

    public CellPhone(int id, double price, double discountRate, int stock, String name, Brand brand, String memory,
                     String screenSize, int batteryPower, int ram, String color) {
        super(id, price, discountRate, stock, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }
}
