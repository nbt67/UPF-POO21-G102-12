import java.util.LinkedList;

public class PolygonalRegion{
    private LinkedList<Point> points;

    public PolygonalRegion (LinkedList<Point> l){
        points = l;
    }

    public double getArea(){
        double determinant = getDeterminant(); 
        double area = (0.5)*determinant;
        return area;
    }

    public  double getDeterminant(){
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
        
        double accum2 = 0;
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

    public void draw(java.awt.Graphics g){ //The method draw(Graphics, double, double) in the type PolygonalRegion 
                                                               //is not applicable for the arguments (Graphics)
        
    }
}