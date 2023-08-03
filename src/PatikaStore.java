import java.util.ArrayList;
import java.util.List;

public class PatikaStore {
    public List<Brand> brands;
    private List<Product> products;

    public PatikaStore() {
        brands = new ArrayList<>();
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));

        products = new ArrayList<>();
    }

    public void listProducts(String category) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (category.equals("Cap Telefonu") && product instanceof CellPhone) {
                filteredProducts.add(product);
            } else if (category.equals("NoteBook") && product instanceof Notebook) {
                filteredProducts.add(product);
            }
        }

        if (filteredProducts.isEmpty()) {
            System.out.println("Kategoriye uygun ürün bulunamadı.");
        } else {
            System.out.println("Benzersiz No | Birim Fiyat | İndirim Oranı | Stok Miktarı | Ürün Adı | Marka");
            for (Product product : filteredProducts) {
                System.out.format("%11d | %10.2f | %13.2f | %12d | %-9s | %s%n", product.getId(), product.getPrice(),
                        product.getDiscountRate(), product.getStock(), product.getName(), product.getBrand().getName());
            }
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int productId) {
        products.removeIf(p -> p.getId() == productId);

    }

    public void filterProductsByBrand(String brandName) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getBrand().getName().equalsIgnoreCase(brandName)) {
                filteredProducts.add(product);
            }
        }

        if (filteredProducts.isEmpty()) {
            System.out.println("Markaya uygun ürün bulunamadı.");
        } else {
            System.out.println("Benzersiz No | Birim Fiyat | İndirim Oranı | Stok Miktarı | Ürün Adı | Marka");
            for (Product product : filteredProducts) {
                System.out.format("%11d | %10.2f | %13.2f | %12d | %-9s | %s%n", product.getId(), product.getPrice(),
                        product.getDiscountRate(), product.getStock(), product.getName(), product.getBrand().getName());
            }
        }
    }
}



