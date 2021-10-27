public class PolygonalRegion{
    private LinkedList<Point> Point;

    public PolygonalRegion (LinkedList<Point> l){
        Point = new LinkedList<Point>();
    }

    public getArea(){
        double determinant = getDeterminant(); 
        double area = (1/2)*determinant;
        return area;
    }

    public getDeterminant(){
        int size = Point.size();
        int accum = 0;
        int i = 0;
        int j = 1;

        while (i != size){
            x = (Point.get(i)).getX;
            y = (Point.get(j)).getY;
            accum += x*y;
            i++;
            j++;
        }
        x = (Point.get(size)).getX;
        y = (Point.get(0)).getY;
        accum += x*y;
        
        int accum2 = 0;
        i = 0;
        j = 1;
        while (i != size){
            y = (Point.get(i)).getY;
            x = (Point.get(j)).getX;
            accum2 += x*y;
            i++;
            j++;
        }
        x = (Point.get(0)).getX;
        y = (Point.get(size)).getY;
        return accum -accum2;
    }

    public draw(Graphics g, double x, double y){
        
    }
}