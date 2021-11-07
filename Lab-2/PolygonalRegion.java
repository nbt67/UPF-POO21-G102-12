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
        return area;
    }

    public  Double getDeterminant(){
        int size = points.size();
        double accum = 0;
        int i = 0;
        int j = 1;
        double x = 0;
        double y = 0;


        while (i < size-1){
            x = (points.get(i)).getX();
            y = (points.get(j)).getY();
            accum += x*y;
            i++;
            j++;
        }
        x = (points.get(size-1)).getX();
        y = (points.get(0)).getY();
        accum += x*y;
        
        Double accum2 = 0.0;
        i = 0;
        j = 1;
        while (i < size-1){  // ¿¿¿¿ <= ????
            y = (points.get(i)).getY();
            x = (points.get(j)).getX();
            accum2 += x*y;
            i++;
            j++;
        }
        x = (points.get(0)).getX();
        y = (points.get(size-1)).getY();
        accum2 += x*y;
        return (accum - accum2);
    }

    public void draw(java.awt.Graphics g){  //The method draw(Graphics, double, double) in the type PolygonalRegion 
        int size = points.size();
        Point point1;
        int[] xInt = new int[10];
        int[] yInt = new int[10]; 
        int x = 0;
        int y = 0;

        for (int i = 0; i < size; i++){
            point1 = points.get(i);
            x = (int) Math.round(point1.getX());        
            y = (int) Math.round(point1.getY());
            xInt[i] = x;
            yInt[i] = y;
        }

        g.drawPolygon( xInt,  yInt, size);
        

        
        //g.drawLine(poin);
        
                                           //is not applicable for the arguments (Graphics)
                                            //use the graphics class mad by java (look it up in the api) ¿delete the graphics.java file that we have created?
    }
}