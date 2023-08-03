public class Main {

    public static void main(String[] args) {
        PatikaStore store = new PatikaStore();

        // Adding sample products
        store.addProduct(new CellPhone(1, 2500.0, 0.15, 100, "Phone A", store.brands.get(0), "128 GB", "6.1 Inc", 4000, 6,
                "Siyah"));
        store.addProduct(new Notebook(2, 5000.0, 0.10, 50, "Notebook X", store.brands.get(1), 8, "512 SSD", "14 inç"));
        store.addProduct(new CellPhone(3, 3000.0, 0.05, 120, "Phone B", store.brands.get(2), "64 GB", "6.1 Inc", 3800, 6,
                "Kırmızı"));
        store.addProduct(new Notebook(4, 4500.0, 0.20, 80, "Notebook Y", store.brands.get(3), 16, "1 TB SSD", "15 inç"));

        // List all cell phones
        System.out.println("Cep Telefonları:");
        store.listProducts("Cep Telefonu");

        // List all notebooks
        System.out.println("\nNotebook'lar:");
        store.listProducts("Notebook");

        // Add a new cell phone
        store.addProduct(new CellPhone(5, 2800.0, 0.12, 90, "Phone C", store.brands.get(4), "64 GB", "5.5 Inc", 3500, 4,
                "Mavi"));

        // List all products after adding a new cell phone
        System.out.println("\nTüm Ürünler:");
        store.listProducts("Cep Telefonu");
        store.listProducts("Notebook");

        // Delete product by ID
        store.removeProduct(2);

        // List all products after deleting a notebook
        System.out.println("\nTüm Ürünler (Notebook silindikten sonra):");
        store.listProducts("Cep Telefonu");
        store.listProducts("Notebook");

        // Filter products by brand name
        System.out.println("\nSamsung Markalı Ürünler:");
        store.filterProductsByBrand("Samsung");
    }
}
