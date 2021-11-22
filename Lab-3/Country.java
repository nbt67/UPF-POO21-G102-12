import java.awt.Graphics;
import java.util.*;

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
        cities.add(c);
    }

    public void addNeighbor(Country c){
        neighbors.add(c);
    }

    public void draw(java.awt.Graphics g, double x, double y){
        int i = 1;
        //cities.get(i).super.draw(g, x, y);
        //Iterate by all the cities(polygonal regions) and draw all of them. Then get the name and cal draw string??
        
        super.draw(g, x, y);
        g.drawString(name, (int) Math.round(x), (int) Math.round(y));
    }
}