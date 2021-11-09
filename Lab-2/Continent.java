import java.util.LinkedList;

public class Continent {
    private LinkedList<PolygonalRegion> countries;

    public Continent(LinkedList<PolygonalRegion> c){
        
    }

    public double getTotalArea(){
        return 0.0;
    }

    public void draw(Graphics g, double x, double y){
        int nPolygonalRegions = countries.size();
        
        for(int i = 0; i<nPolygonalRegions; i++){
            PolygonalRegion country = countries.get(i);
            //country.draw(g);
        }      
    }
}
