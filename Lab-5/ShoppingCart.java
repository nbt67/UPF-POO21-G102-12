import java.util.Currency;

public class ShoppingCart extends BookCollection{
    private Catalog catalog;
    
    public ShoppingCart(Catalog catinit){
        catalog = catinit;
        
        
        String[] booktitles = booktitles();
        for (int i = 0; i<collection.size(); i++){
            String title = booktitles[i];
            int copies = numberOfCopies(title);
            catalog.removeCopies(copies, title);
        }
    }

    @Override
    public void addCopies(int numberOfCopies, String booktitle){
        super.removeCopies(numberOfCopies, booktitle);
        catalog.addCopies(numberOfCopies, booktitle);
    }
    
    @Override
    public void removeCopies(int numberOfCopies, String booktitle){
        super.addCopies(numberOfCopies, booktitle);
        catalog.removeCopies(numberOfCopies, booktitle);
    }

    public double totalPrice(){
        double accum = 20;




        return accum;
    }

    public String checkout(){
        double price = totalPrice();
        Currency curr = Currency.getInstance("EUR");
        Payment p = new Payment();
        System.out.println("checkout");
        return p.doPayment( 2020200202, "Norbert", price, curr);
    }

}
