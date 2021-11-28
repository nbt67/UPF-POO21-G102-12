import java.util.*;
import java.awt.Graphics;

public class EllipsoidalRegion extends Region{
    private Point c;
    private double r1,r2;

    public EllipsoidalRegion(Point point, double newr1, double newr2){
        c = point;
        r1 = newr1;
        r2 = newr2;
    }

    public double getArea(){
        double area = Math.PI * r1 * r2;
        return area;
    }

    public void draw(java.awt.Graphics g){       
        g.setColor( super.getFillColor() );
        g.fillOval((int) Math.round(c.getX()), (int) Math.round(c.getY()), (int) Math.round(r1), (int) Math.round(r2));
        g.setColor( super.lineColor );
        g.drawOval((int) Math.round(c.getX()), (int) Math.round(c.getY()), (int) Math.round(r1), (int) Math.round(r2));  
    }

    public void move(Vector v) {
        c.move(v.vy, v.vy);
    }

    public boolean isSelected(Point p) {


        return true;
    }

    public boolean isPointInside(Point p) {
        double result = (Math.pow((p.getX()-c.getX()), 2)/Math.pow(r1, 2)+Math.pow((p.getY()-c.getY()), 2)/Math.pow(r2, 2));
        if (result <=1){
            return true;
        }else {
            return false;
        }
    }
}