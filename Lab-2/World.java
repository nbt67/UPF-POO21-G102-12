import java.util.LinkedList;

public class World {
    private LinkedList<Continent> c;

    public World (LinkedList<Continent> c){

    }

    public void draw (Graphics g, double x, double y){

        int nPolygonalRegions = c.size();
        
        for(int i = 0; i<nPolygonalRegions; i++){
            Continent cont = c.get(i);
            cont.draw(g, y, y);
        }
    }
}
