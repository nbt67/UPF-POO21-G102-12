import java.util.LinkedList;

public class Continent {
    private LinkedList<PolygonalRegion> countries;

    public Continent(LinkedList<PolygonalRegion> c){
        countries = c;
    }

    public double getTotalArea(){
        int nPolygonalRegions = countries.size();
        PolygonalRegion c = null;
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
        
        for(int i = 0; i<nPolygonalRegions; i++){
            PolygonalRegion country = countries.get(i);
            country.draw(g, x, y);
        }      
    }
}
