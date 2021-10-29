import java.util.LinkedList;

public class PolygonalRegion{
    private LinkedList<Point> point;

    public PolygonalRegion (LinkedList<Point> l){
        point = new LinkedList<Point>();
    }

    public double getArea(){
        double determinant = getDeterminant(); 
        double area = (1/2)*determinant;
        return area;
    }

    public  double getDeterminant(){
        int size = point.size();
        int accum = 0;
        int i = 0;
        int j = 1;
        double x = 0;
        double y = 0;


        while (i != size){
            x = (point.get(i)).getX();
            y = (point.get(j)).getY();
            accum += x*y;
            i++;
            j++;
        }
        x = (point.get(size)).getX();
        y = (point.get(0)).getY();
        accum += x*y;
        
        int accum2 = 0;
        i = 0;
        j = 1;
        while (i != size){
            y = (point.get(i)).getY();
            x = (point.get(j)).getX();
            accum2 += x*y;
            i++;
            j++;
        }
        x = (point.get(0)).getX();
        y = (point.get(size)).getY();
        return accum -accum2;
    }

    public void draw(java.awt.Graphics g){ //The method draw(Graphics, double, double) in the type PolygonalRegion 
                                                               //is not applicable for the arguments (Graphics)
        
    }
}