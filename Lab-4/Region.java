public abstract class Region extends Entity{
    private Color fillColor;

    public Region(Color lcinit){
        super(lcinit);
    }
    
    public void setFillColor(Color c){

    }

    public abstract double getArea();    
    public abstract boolean isPointInside(Point p);
    
}