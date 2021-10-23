import java.math. *;

public class Point {
    private double x;
    private double y;
    private String name;

    public Point (double initX, double initY, String initName){
        x = initX;
        y = initY;
        name = initName;
    }

    public double getX(){
        return x;
    }
    
    public double getY (){
        return y;
    }

    public String getName(){
        return name;
    }
    
    public void setX (double newX){
        this.x = newX;
    }
    
    public void setY (double newY){
        this.y = newY;
    }

    public void setName (String newName){
        this.name = newName;
    }
    public double distance_bp(Point point){
        double distance = Math.sqrt(Math.pow((x+y), 2)+Math.pow(point.getX()+point.getY(), 2));
        return distance;
    }
}