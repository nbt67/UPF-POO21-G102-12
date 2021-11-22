import java.util.*;

public class World {
    private List<Continent> continents;

    public World (List<Continent> c){
        continents = c;
    }

    public void draw (java.awt.Graphics g, double x, double y){
        int nPolygonalRegions = continents.size();
        Continent cont;
        
        for(int i = 0; i<nPolygonalRegions; i++){
            cont = continents.get(i);
            cont.draw(g, x, y);
        }
    }
}