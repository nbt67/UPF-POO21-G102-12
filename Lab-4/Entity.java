import java.awt.Graphics;
import java.util.Vector;

public abstract class Entity {
    protected Color lineColor;
    private double alpha;

    public Entity(){
    }

    public abstract void draw(java.awt.Graphics g);

    public void setColor(Color c){

    }

    public Color getColor(){

        return null;
    }

    public void rotate(double a){

    }

    public abstract void move( Vector v );    

    public abstract boolean isSelected(Point p);
}
