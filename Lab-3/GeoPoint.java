import java.awt.Graphics;

public class GeoPoint extends Point{
    private String name;

    public GeoPoint(double xi, double yi, String n){
        GeoPoint.super(xi, yi, n);
    }

    public void draw(java.awt.Graphics g, double x, double y){
        xInt = (int) Math.round(super.getX());        
        yInt = (int) Math.round(super.getY()); 

        fillOval(xInt, yInt, x, y);
        drawString(name, xInt, yInt);
        

    }
}
