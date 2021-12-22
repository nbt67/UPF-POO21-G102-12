import java.util.LinkedList;

public class Catalog extends BookCollection{
    public Catalog(){
        LinkedList<String[]> list = new LinkedList<String[]>();
        // add elements to the list
        //for ( String element : list ) {
        //System.out.println( element ); // or another operation on elements
        //}
    
        list = readCatalog("books.xml");
        
        System.out.println(list.get(1));
        
        //Date date = new Date();
        //try { date = new SimpleDateFormat().parse( myString ); } // Date instance
        //catch( Exception e ) {}
        //long isbn = Long.parseLong( myString ); // convert to long
        //double price = Double.parseDouble( myString ); // convert to double
        //Currency currency = Currency.getInstance( myString ); // Currency instance
        //int copies = Integer.parseInt( myString ); // convert to int

        //Stock s1 = new Stock();
    }
}
