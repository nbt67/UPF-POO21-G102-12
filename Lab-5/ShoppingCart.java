public class ShoppingCart extends BookCollection{
    private Catalog catalog;
    
    public ShoppingCart(Catalog catinit){
        catalog = catinit;
        
        
        String[] booktitles = booktitles();
        for (int i = 0; i<collection.size(); i++){
            String title = booktitles[i];
            int copies = numberOfCopies(title);
            super.removeCopies(copies, title);
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
        return catalog;
    }

    public String checkout(){
        return "";
    }

}
