import java.awt.Graphics;
import java.awt.Color;

public abstract class Entity {
    protected java.awt.Color lineColor;
    private double alpha;

    public Entity(){
    }

    public void setColor(java.awt.Color c){
        lineColor = c;
    }

    public Color getColor(){
        return lineColor;
    }

    public void rotate(double a){
        
    }

    public abstract void draw(java.awt.Graphics g);

    public abstract void move( Vector v );    

    public abstract boolean isSelected(Point p);
}
