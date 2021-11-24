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
        g.drawOval((int) Math.round(c.getX()), (int) Math.round(c.getY()), (int) Math.round(r1), (int) Math.round(r2));
    }

    public void move(Vector v) {

    }

    public boolean isSelected(Point p) {
        return true;
    }

    public boolean isPointInside(Point p) {
        return false;
    }
}