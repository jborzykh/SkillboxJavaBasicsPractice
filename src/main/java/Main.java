public class Main {
    public static void main(String[] args) {
//        add("bread", 40);
//        add("milk", 50);
//        add("cheese", 500);
//        print("Basket contains: ");
//        System.out.println(getTotalPrice());
//        System.out.println(contains("колбаса"));
//        System.out.println(contains("cheese"));
//        clear();
//        System.out.println(getTotalPrice());
//        print("");
        // создаем новую корзину
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("milk", 50);
        vasyaBasket.add("cola", 100);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("cheese", 500);
        petyaBasket.add("bread", 40);

        vasyaBasket.print("Vasya Basket:");
        petyaBasket.print("Petya Basket:");

        Basket mashaBasket = new Basket("chair", 5000);
        mashaBasket.print("Masha Basket: ");

    }
}
