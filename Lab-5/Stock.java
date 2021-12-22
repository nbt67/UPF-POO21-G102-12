import java.util.Currency;

public class Stock implements StockInterface{
    private Book book;
    private int copies;
    private double price;
    private Currency currency;

    public Stock(Book bookinit,int copinit, double priceinit, Currency curinit){
        book = bookinit;
        copies = copinit;
        price = priceinit;
        currency = curinit;
    }

    public Book getBook(){
        return book;
    }

    public String getBooktitle(){
        return book.getTitle();
    }

    public int numberOfCopies(){
        return copies;
    }

    public void addCopies(int numberOfCopies){
        copies = copies + numberOfCopies;
    }

    public void removeCopies(int numberOfCopies){
        if (numberOfCopies <= copies){
            copies = copies - numberOfCopies;
        }
    }

    public double totalPrice(){        
        return price*copies;
    }

    public Currency getCurrency(){
        return currency;
    }
}
