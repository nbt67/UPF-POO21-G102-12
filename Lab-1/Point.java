public class Point {
    private Integer x;
    private Integer y;
    private String name;

    public Point (Integer initX, Integer initY, String initName){
        x = initX;
        y = initY;
        name = initName;
    }

    public Integer getX(){
        return x;
    }
    
    public Integer getY (){
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