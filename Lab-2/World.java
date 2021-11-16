//Corregit
import java.util.LinkedList;

public class World {
    private LinkedList<Continent> continents;

    public World (LinkedList<Continent> c){
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
