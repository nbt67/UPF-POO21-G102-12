import java.util.LinkedList;
import java.awt.Graphics;

public class EllipsoidalRegion {
    private Point c;
    private double r1,r2;

    public EllipsoidalRegion(Point point, double newr1, double newr2){
        c = point;
        r1 = newr1;
        r2 = newr2;
    }

    public double getArea(){
        return 0.0;
    }

    public void draw(java.awt.Graphics g){

    }
}
