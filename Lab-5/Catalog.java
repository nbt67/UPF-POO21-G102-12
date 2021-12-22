import java.util.LinkedList;
import java.util.Date;
import java.text.*;
import java.util.Currency;

public class Catalog extends BookCollection{
    public Catalog(){
        LinkedList<String[]> list = new LinkedList<String[]>();
        list = readCatalog("Lab-5/books.xml");

        LinkedList<Stock> stockList = new LinkedList<Stock>();

        Date date = new Date();
        String[] titleArray = list.get(0);
        String[] authorArray = list.get(1);
        String[] dateArray  = list.get(2);
        String[] placeArray = list.get(3);
        String[] ISBNArray = list.get(4);
        String[] priceArray = list.get(5);
        String[] currencyArray = list.get(6);
        String[] copiesArray = list.get(7);

        for (int i = 0; i<list.size(); i++){
            String title = titleArray[i];

            String author = authorArray[i];

            String dateString = dateArray[i];
            try { date = new SimpleDateFormat().parse( dateString ); }
            catch( Exception e ) {}         

            String place = placeArray[i];

            String isbnString = ISBNArray[i];
            int isbn = Integer.parseInt( isbnString );

            String priceString = priceArray[i];
            double price = Double.parseDouble( priceString ); 

            String currencyString = currencyArray[i];
            Currency currency = Currency.getInstance( currencyString );

            String copiesString = copiesArray[i];
            int copies = Integer.parseInt( copiesString );

            Book book1 = new Book(title, author, date, place, isbn);
            Stock s1 = new Stock(book1, copies, price, currency);
            stockList.add(s1);
        }
    }
}
