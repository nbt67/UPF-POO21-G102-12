import java.util.*;
import java.awt.Graphics;
import java.awt.Color;

public class Ocean extends PolygonalRegion{

    public Ocean(List<Point> l){
        super(l);
    }

    public double getArea(){
        double area = super.getArea();
        return area;
    }

    public void draw(java.awt.Graphics g, double x, double y){
        Color c = new Color(0,255,255);
        int nPoints = (super.points).size();
        Point point1;
        int[] xInt = new int[nPoints];
        int[] yInt = new int[nPoints]; 

        for (int i = 0; i < nPoints; i++){
            point1 = points.get(i);
            xInt[i] = (int) Math.round(point1.getX());        
            yInt[i] = (int) Math.round(point1.getY()); 
        }  
        
        g.setColor(c);
        g.fillPolygon(xInt,  yInt, nPoints);
        c = new Color(0,0,0);
        g.setColor(c);
    }
}