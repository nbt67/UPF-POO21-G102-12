import java.util.*;

public class Continent {
    private List<Country> countries;

    public Continent(List<Country> c){
        countries = c;
    }

    public double getTotalArea(){
        int nPolygonalRegions = countries.size();
        PolygonalRegion c;
        double accum = 0;

        for(int i = 0; i<nPolygonalRegions; i++){
            c = countries.get(i);
            accum += c.getArea();
        }    
    
        System.out.println("The area of the continent is: " + accum);
        return accum;
    }

    public void draw(java.awt.Graphics g, double x, double y){
        int nPolygonalRegions = countries.size();
        Country country;
        
        for(int i = 0; i<nPolygonalRegions; i++){
            country = countries.get(i);
            country.draw(g, x, y);
        }      
    }
}