import java.util.*;
import java.awt.Graphics;
import java.awt.Polygon;

public class PolygonalRegion extends Region{
    public List<Point> points;

    public PolygonalRegion (List<Point> l){
        points = l;
    }
    
    public double getArea(){
        int nPoints = points.size();
        Point point1;
        Point point2;
        double side1 = 0;
        double side2 = 0;
        double positive = 0;
        double negative = 0;
        
        for (int i = 0; i < nPoints-1; i++){    
            point1 = points.get(i);
            point2 = points.get(i+1);

            positive = point1.getX()*point2.getY();
            side1 = side1+positive;

            negative = point1.getY()*point2.getX();
            side2 = side2 + negative;
        }

        double x1 = points.get(0).getX();
        double xn = points.get(nPoints-1).getX();
        double y1 = points.get(0).getY();
        double yn = points.get(nPoints-1).getY();
        
        side1 = side1 + (xn*y1);
        side2 = side2 + (yn*x1);

        double determinant = side1-side2;
        double area = (0.5)*determinant;
        return area;
    }

    public void draw(java.awt.Graphics g){
        int nPoints = points.size();
        Point point1;
        int[] xInt = new int[nPoints];
        int[] yInt = new int[nPoints]; 

        for (int i = 0; i < nPoints; i++){
            point1 = points.get(i);
            xInt[i] = (int) Math.round(point1.getX());        
            yInt[i] = (int) Math.round(point1.getY()); 
        }
        Polygon p = new Polygon(xInt, yInt, nPoints);
        g.drawPolygon(p);  

        g.setColor( super.getFillColor() );
        g.fillPolygon(p);
        g.setColor( super.lineColor );
        g.drawPolygon(p);  
    }

    public boolean isPointInside(Point p) {
        int nPoints = points.size();
        Point point1;
        for (int i = 0; i < nPoints; i++){
            point1 = points.get(i);
            //difference

            //xInt[i] = (int) Math.round(point1.getX());        
            //yInt[i] = (int) Math.round(point1.getY()); 
        }





        return false;
    }
    
    public void move(Vector v) {
        
    }

    public boolean isSelected(Point p) {
        return false;
    }

}