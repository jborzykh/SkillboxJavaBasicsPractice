package Product;

public class Main {
    public static void main(String[] args) {
//        Product a = new Product("milk", 50);
//        Product b = a;
//        a.setName("juice");
//
//        System.out.println(a);
//        System.out.println(b);

        Product product = new Product("bread", 56);
        Order order = new Order();
        order.addProduct(product);
        System.out.println(product);

    }
}

