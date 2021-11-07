public class Point {
    private int x;
    private int y;
    private String name;

    public Point (int initX, int initY, String initName){
        x = initX;
        y = initY;
        name = initName;
    }

    public int getX(){
        return x;
    }
    
    public int getY (){
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