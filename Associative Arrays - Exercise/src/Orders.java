import java.util.*;

public class Orders {

    static class Product {

        String name;
        double price;
        int quantity;

        public Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Product> products = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("buy")) {

            String[] data = line.split("\\s+");

            String productName = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if (products.containsKey(productName)) {
                products.get(productName).setPrice(price);
                products.get(productName).setQuantity(products.get(productName).getQuantity() + quantity);
            } else {
                products.put(productName, new Product(productName, price, quantity));
            }


            line = scanner.nextLine();
        }
        products.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v.getPrice() * v.getQuantity()));


    }
}
