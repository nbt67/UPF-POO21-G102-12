import java.util.LinkedList;
import java.awt.Graphics;

public class PolygonalRegion{
    private LinkedList<Point> points;

    public PolygonalRegion (LinkedList<Point> l){
        points = l;
    }

    public double getArea(){
        Double determinant = getDeterminant(); 
        Double area = (0.5)*determinant;
        System.out.println(area);
        return area;
    }

    public  Double getDeterminant(){

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
        return side1-side2;
    }

    public void draw(java.awt.Graphics g){  //The method draw(Graphics, double, double) in the type PolygonalRegion 
        int nPoints = points.size();
        Point point1;
        int[] xInt = new int[nPoints];
        int[] yInt = new int[nPoints]; 

        for (int i = 0; i < nPoints; i++){
            point1 = points.get(i);
            xInt[i] = (int) Math.round(point1.getX());        
            yInt[i] = (int) Math.round(point1.getY()); 
        }
        g.drawPolygon( xInt,  yInt, nPoints);    
        
        //g.drawLine(poin);
        
                                           //is not applicable for the arguments (Graphics)
                                            //use the graphics class mad by java (look it up in the api) ¿delete the graphics.java file that we have created?
    }
}