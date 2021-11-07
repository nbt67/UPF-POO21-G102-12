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
        Double x = 0.0;
        Double y = 0.0;


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
        LinkedList<Integer> xDoubles = new LinkedList<Integer>(); 
        LinkedList<Integer> yDoubles = new LinkedList<Integer>(); 

        for (int i = 0; i < size; i++){
            point1 = points.get(i);
            xDoubles.add(point1.getX());
            yDoubles.add(point1.getY());
        }

        draw
        

        
        //g.drawLine(poin);
        
                                           //is not applicable for the arguments (Graphics)
                                            //use the graphics class mad by java (look it up in the api) ¿delete the graphics.java file that we have created?
    }
}