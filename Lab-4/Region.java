import java.awt.Color;

public abstract class Region extends Entity{
    private java.awt.Color fillColor;

    public Region(){

    }
    
    public void setFillColor(java.awt.Color c){
        fillColor = c;
    }

    public Color getFillColor(){
        return fillColor;
    }

    public abstract double getArea();    
    public abstract boolean isPointInside(Point p);
    
}