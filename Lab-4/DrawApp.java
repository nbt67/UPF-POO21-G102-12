import java.util.*;
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

    public void draw(java.awt.Graphics g){//?¿¿?¿?
        //super.paintComponent(g);
		for ( int i = 0; i < entities.size(); ++i )
            entities.get( i ).draw( g );
    }

    private List<Entity> selected (Point p){//?¿¿?¿?

        return null;
    }

    private boolean isSelected(Entity e){//?¿¿?¿?
        boolean b;
        for ( int i = 0; i < entities.size(); ++i ){
            //b = entities.get( i ).selected(p);            
        }

        //return b;
        return true;
    }

    public void selection (Point p){//?¿¿?¿?
        for ( int i = 0; i < entities.size(); ++i ){
            entities.get( i ).isSelected(p);            
        }
    }
    
    public void move ( Vector v){
        for ( int i = 0; i < entities.size(); ++i )
            entities.get( i ).move( v );
    }
}
