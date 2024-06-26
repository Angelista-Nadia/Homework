import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Chair", 999.99, Category.CATEGORY1, true, List.of(
                        new Store(1, "Moscow", "12 Kirpichnaya St", "333-3333")),
                        List.of(new Manufacturer("Mmm", "USA"))
                ),
                new Product("Lamp", 699.99, Category.CATEGORY2, true, List.of(
                        new Store(1, "Moscow", "12 Kirpichnaya St", "333-3333")),
                        List.of(new Manufacturer("Ppp", "China"))
                ),
                new Product("Wardrobe", 18999.99, Category.CATEGORY3, false, List.of(
                        new Store(2, "St.Petersburg", "10 Yakornaya St", "555-5555")),
                        List.of(new Manufacturer("Ppp", "China"))
                ),
                new Product("Table", 5999.99, Category.CATEGORY1, false, List.of(
                        new Store(3, "Moscow", "7 Kirova St", "222-2222")),
                        List.of(new Manufacturer("Sss", "Russia"))
                ),
                new Product("Vase", 499.99, Category.CATEGORY2, true, List.of(
                        new Store(2, "St.Petersburg", "10 Yakornaya St", "555-5555")),
                        List.of(new Manufacturer("Sss", "Russia"))
                )
        );
        // Найти самый дорогой товар
        Product mostExpensive = products.stream()
                .max(Comparator.comparing(Product::getCost))
                .orElse(null);

        // Найти самый дешевый товар
        Product cheapest = products.stream()
                .min(Comparator.comparing(Product::getCost))
                .orElse(null);

        System.out.println("Most Expensive Product: " + mostExpensive);
        System.out.println("Cheapest Product: " + cheapest);

        // Найти все товары, которые возможно доставить до покупателя
        List<Product> findDelivery = products.stream()
                .filter(Product::isDelivery)
                .toList();

        System.out.println("Delivery: " + findDelivery);

        // Посчитать среднюю стоимость товара указанной категории
        double costByCategory= products.stream()
                .filter(product -> product.getCategory() == Category.CATEGORY1)
                .mapToDouble(Product::getCost)
                .average()
                .orElse(0.0);

        System.out.println("Средняя стоимость товара категории 1: " + costByCategory);

        // Hайти все товары определенного производителя
        List<Product> findManufacturer = products.stream()
                .filter(product -> product.getManufacturer().stream()
                        .anyMatch(manufacturer -> manufacturer.getName().equals("Sss")))
                .toList();

        System.out.println("Manufacturer Sss: " + findManufacturer);

        // Найти всех названия производителей указанной страны
        List<String> usaManufacturer = products.stream()
                .flatMap(product -> product.getManufacturer().stream())
                .filter(manufacturer -> manufacturer.getCountry().equals("USA"))
                .map(Manufacturer::getName)
                .toList();

        System.out.println("USA Manufacturers: " + usaManufacturer);

        // Найти все магазины конкретного города
        List<String> storesInMoscow = products.stream()
                .flatMap(product -> product.getStores().stream())
                .filter(store -> store.getCity().equals("Moscow"))
                .map(Store::getAddress)
                .toList();

        System.out.println("Stores in Moscow:" + storesInMoscow);

        // Найти адрес магазина по указанному номеру телефона
        Store foundStore = products.stream()
                .flatMap(product -> product.getStores().stream())
                .filter(store -> store.getPhoneNumber().equals("555-5555"))
                .findFirst()
                .orElse(null);

        if (foundStore != null) {
            System.out.println("Store found: " + foundStore.getAddress());
        } else {
            System.out.println("Store with phone number 555-5555 not found.");
        }

        // Все товары указанного номера магазина
        List<Product> productsInStore = products.stream()
                .filter(product -> product.getStores().stream()
                        .anyMatch(store -> store.getNumber() == 1))
                .toList();

        System.out.println("Products of the store number 1: " + productsInStore);

        // Составить map где ключ это номер магазина, а значение - это номер телефона данного магазина
        Map<Integer, String> storePhoneMap = products.stream()
                .flatMap(product -> product.getStores().stream())
                .collect(Collectors.toMap(Store::getNumber, Store::getPhoneNumber));

        System.out.println(storePhoneMap);

        // Узнать все ли товары указанной категории можно доставить до покупателя
        boolean allDelivery = products.stream()
                .filter(product -> product.getCategory() == Category.CATEGORY1)
                .allMatch(Product::isDelivery);

        System.out.println("Can all products of CATEGORY1 be delivered? " + allDelivery);

        // Посчитать количество магазинов
        long storeCount = products.stream()
                .flatMap(product -> product.getStores().stream())
                .map(Store::getNumber)
                .distinct()
                .count();

        System.out.println("Count number of stores: " + storeCount);

        // Вывести товары отсортированные по стоимости (от большего к меньшему)
        List<Product> sortedProducts = products.stream()
                .sorted(Comparator.comparing(Product::getCost).reversed())
                .toList();

        sortedProducts.forEach(product -> System.out.println(product.getName() + " - " + product.getCost() + " RUB"));
    }
}
