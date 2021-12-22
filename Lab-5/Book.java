import java.sql.Date;

public class Book {
    private String title;
    private String author;
    private Date publicationDate;
    private String publicationPlace;
    private int ISBN;

    public Book(String tlinit, String auinit, Date dtinit, String plinit, int isbn){
        title = tlinit;
        author = auinit;
        publicationDate = dtinit;
        publicationPlace = plinit;
        ISBN = isbn;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public Date getPublicationDate(){
        return publicationDate;
    }

    public String getPublicationPlace(){
        return publicationPlace;
    }

    public int getISBN(){
        return ISBN;
    }
}