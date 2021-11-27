import java.awt.Graphics;
import java.awt.Color;

public abstract class Entity {
    protected java.awt.Color lineColor;
    private double alpha;

    public Entity(){
    }

    public abstract void draw(java.awt.Graphics g);

    public void setColor(java.awt.Color c){
        lineColor = c;
    }

    public Color getColor(){

        return null;
    }

    public void rotate(double a){

    }

    public abstract void move( Vector v );    

    public abstract boolean isSelected(Point p);
}
