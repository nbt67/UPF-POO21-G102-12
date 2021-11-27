import java.util.*;
import java.util.Vector;
import java.awt.Graphics;

public class DrawApp {
    private List<Entity> entities;
    private List<Entity> select;

    public DrawApp(){
        entities = new ArrayList<>();
    }

    public void addEntity(Entity e){
        entities.add( e );
    }

    public void draw(java.awt.Graphics g){
        //super.paintComponent(g);
		for ( int i = 0; i < entities.size(); ++i )
            entities.get( i ).draw( g );
    }

    private List<Entity> selected (Point p){
        return null;
    }

    private boolean isSelected(Entity e){
        return true;
    }

    public void selection (Point p){

    }
    
    public void move ( Vector v){
        for ( int i = 0; i < entities.size(); ++i )
            entities.get( i ).move( v );
    }
}
