import java.awt.Graphics;

public class Country extends PolygonalRegion{
    private String name;
    private LinkedList<City> cities;
    private LinkedList<Country> neighbors;
    private City capital;

    public Country(LinkedList<Point> l, City cap){
        Country.super(l);
        capital = cap;
    }    

    public void addCity(City c){

    }

    public void addNeighbor(Country c){

    }

    public void draw(java.awt.Graphics g, double x, double y){
        
    }
}
