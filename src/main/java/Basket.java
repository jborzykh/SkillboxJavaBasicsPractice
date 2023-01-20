public class Basket {

    private String items = "";
    private int totalPrice = 0;
    private int limit;

//    private static int timeout = getTimeout();
//
//    private static int getTimeout(int timeout) {
//        int secondsInHour = 3600;
//        int hoursInDay = 24;
//        int daysInWeek = 7;
//        timeout = secondsInHour * hoursInDay * daysInWeek;
//        return timeout;
//    }

    // 4.6 создание контстуктора с limit

    public Basket() {

        items = "Shopping list: ";
        this.limit = 1000;
    }


    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public Basket(int limit) {
        this(); //чтобы повторно не писать   items = "Shopping list: ";
        // вызываем из предыдущего конструктора без параметров

        this.limit = limit;
    }


    //4.5 классы и объекты, убрали main в отдельный файл, убрали static у всех методов

    public void add(String name, int price) {
        //код из 4.5
//        if(contains(name)){
//            return;
//        }
//        if (totalPrice + price > limit){
//            return;
//        }
//        items = items + "\n" + name + " - " + price;
//        totalPrice = totalPrice + price;
        //код после перезагрузки
        add(name, price, 1);
    }

    // 4.6 перегрузка методов

    public void add(String name, int price, int count) {
        if (contains(name)) {
            return;
        }
        if (totalPrice + count * price > limit) {
            return;
        }
        items = items + "\n" + name + " " + count + " - " + price;
        totalPrice = totalPrice + count * price;

    }


    public void clear() {

        items = "";
        totalPrice = 0;
    }

    //возвращаем стоимость всех товаров в корзине
    public int getTotalPrice() {
        return totalPrice;
    }

    //проверяем есть ли в корзине определенный товар
    public boolean contains(String name) {
        return (items.contains(name));
    }

    public void print(String title) {

        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Basket is empty");
        } else {
            System.out.println(items);
        }

    }


}

//    4.3 и 4.4 методы
//    public static void main(String[] args) {
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
//
//    }
//
//    public static void add(String name, int price) {
//        if(contains(name)){
//            return;
//}
//        items = items + "\n" + name + " - " + price;
//        totalPrice = totalPrice + price;
//    }
//
//
//    public static void clear() {
//
//        items = "";
//        totalPrice = 0;
//    }
//    //возвращаем стоимость всех товаров в корзине
//    public static int getTotalPrice(){
//        return totalPrice;
//    }
//
//    //проверяем есть ли в корзине определенный товар
//    public static boolean contains (String name){
//        return (items.contains(name));
//
//        // упростили с варианта
////         if(items.contains(name)){
////            return true;
////            }
////         return false;}
//
//    }
//
//    public static void print(String title) {
//        System.out.println(title);
//        if (items.isEmpty()) {
//            System.out.println("Basket is empty");
//        } else {
//            System.out.println(items);
//        }
//
//    }
