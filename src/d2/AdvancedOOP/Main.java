package d2.AdvancedOOP;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("tomato",3.2);
        System.out.println(product.getId());
        Product product1 = new Product("leek",3.1);
        System.out.println(product1.getId());


        CartItem cartItem = new CartItem();
        cartItem.setProduct(product);

        CartItem cartItem1 = new CartItem();
        cartItem1.setProduct(product);


        System.out.println(product.getName());

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product,3);
        shoppingCart.addProduct(product,2);
        shoppingCart.addProduct(product1,4);


        shoppingCart.removeProduct(product1);
        shoppingCart.addProduct(product1,1);
        shoppingCart.addProduct(product1,1);

        shoppingCart.updateProduct(product,2);

        for (CartItem it: shoppingCart.cartItems) {
            System.out.println(it.toString());

        }

    }


}
