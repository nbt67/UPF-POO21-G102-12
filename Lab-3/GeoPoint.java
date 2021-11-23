import java.awt.Graphics;

public class GeoPoint extends Point{
    private String name;

    public GeoPoint(double xi, double yi, String n){
        super(xi, yi, n);
        name = n;
    }    

    public void draw(java.awt.Graphics g, double x, double y){
        int xInt = (int) Math.round(super.getX());        
        int yInt = (int) Math.round(super.getY()); 
        int width = (int) Math.round(x);        
        int height = (int) Math.round(y);  

        g.fillOval(xInt, yInt, width, height);
        g.drawString(name, xInt, yInt);
    }
}