import java.util.Currency;

public class ShoppingCart extends BookCollection implements ShoppingCartInterface{
    private Catalog catalog;
    
    public ShoppingCart(Catalog catinit){
        super();
        catalog = catinit;
        
        
        /*for (StockInterface element : catalog.collection){
            String title = element.getBooktitle();
            int copies = numberOfCopies(title);
            System.out.println(copies);
            catalog.removeCopies(copies, title);
        }        
        */
    }

    @Override
    public void addCopies(int numberOfCopies, String booktitle){
        catalog.removeCopies(numberOfCopies, booktitle);

        for (StockInterface element : catalog.collection){
            if (element.getBooktitle() == booktitle){
                StockInterface stock = getStock(booktitle);
                if(stock == null){
                    Book book = element.getBook();
                    double price = element.totalPrice();
                    Currency currency = element.getCurrency();
                    stock = new Stock(book, numberOfCopies, price, currency);
                    collection.add(stock);
                } else { 
                    stock.addCopies(numberOfCopies);
                }
            }
        }  
    }
    
    @Override
    public void removeCopies(int numberOfCopies, String booktitle){
        catalog.addCopies(numberOfCopies, booktitle);
        
        for (StockInterface element : catalog.collection){
            if (element.getBooktitle() == booktitle){
                StockInterface stock = getStock(booktitle);
                if(stock == null){
                    Book book = element.getBook();
                    double price = element.totalPrice();
                    Currency currency = element.getCurrency();
                    stock = new Stock(book, numberOfCopies, price, currency);
                    collection.add(stock);
                } else { 
                    stock.removeCopies(numberOfCopies);
                }
            }
        }
    }

    public double totalPrice(){
        double accum = 0;
        for (StockInterface element : catalog.collection){
            double price = element.totalPrice();
            accum += price;
        }
        return accum;
    }

    public String checkout(){
        double price = totalPrice();
        Currency curr = Currency.getInstance("EUR");
        Payment p = new Payment();
        return p.doPayment(2020200202, "Norbert", price, curr);
    }

}
