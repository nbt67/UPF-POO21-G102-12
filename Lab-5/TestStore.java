//Graded
public class TestStore {
    public static void main( String[] args ) {
        Catalog c = new Catalog();
        ShoppingCart shoppingCart1 = new ShoppingCart(c);

        shoppingCart1.addCopies(2, "The Hobbit");
        //shoppingCart1.addCopies(4, "H. Rider Haggard");
        //shoppingCart1.removeCopies(3, "H. Rider Haggard");
        String s = shoppingCart1.checkout();
        System.out.println(s);
    }
}
