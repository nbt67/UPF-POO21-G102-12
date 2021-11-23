import java.awt.Graphics;
import java.util.*;

public class Country extends PolygonalRegion{
    private String name;
    private List <City> cities;
    private List <Country> neighbors;
    private City capital;

    public Country(List<Point> l, City cap, String countryName, List<City> c){
        super(l);
        name = countryName;
        cities = c;
        capital = cap;
    }

    public void addCity(City c){
        cities.add(c);
    }

    public void addNeighbor(Country c){
        neighbors.add(c);
    }

    public void draw(java.awt.Graphics g, double x, double y){
        int nCities = cities.size();
        City city;
        System.out.println("Drawing Country:" + name);
        super.draw(g, x, y);

        for(int i = 0; i<nCities; i++){
            city = cities.get(i);
            city.draw(g, x, y);
            g.drawString(name, (int) Math.round(x), (int) Math.round(y));
        }           
    }
}