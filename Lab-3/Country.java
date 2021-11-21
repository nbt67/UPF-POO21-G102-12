import java.awt.Graphics;
import java.util.List;

public class Country extends PolygonalRegion{
    private String name;
    private List <City> cities;
    private List <Country> neighbors;
    private City capital;

    public Country(List<Point> l, City cap){
        super(l);
        capital = cap;
    }

    public void addCity(City c){

    }

    public void addNeighbor(Country c){

    }

    public void draw(java.awt.Graphics g, double x, double y){
        
    }
}