package Product;

public class Order {
    public void addProduct(Product product){
        //adds product 5.5
//        if(product.getPrice() > 50){
//            product.setPrice(product.getPrice() - 10);
//        }

        //5.6 copy product

        Product copy = new Product(product.getName(), product.getPrice());
        // add copy to order


    }
}
