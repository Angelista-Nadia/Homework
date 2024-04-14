import java.util.List;

public class Product {
    private String name;
    private double cost;
    private Category category;
    private boolean delivery;
    private List<Store> stores;
    private List<Manufacturer> manufacturer;

    public Product(String name, double cost, Category category, boolean delivery, List<Store> stores, List<Manufacturer> manufacturer) {
        this.name = name;
        this.cost = cost;
        this.category = category;
        this.delivery = delivery;
        this.stores = stores;
        this.manufacturer = manufacturer;
    }

    public double getCost() {
        return cost;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public Category getCategory() {
        return category;
    }

    public List<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public List<Store> getStores() {
        return stores;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", category=" + category +
                ", delivery=" + delivery +
                ", stores=" + stores +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
