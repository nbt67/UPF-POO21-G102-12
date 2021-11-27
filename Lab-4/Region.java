public abstract class Region extends Entity{
    private Color fillColor;

    public Region(){

    }
    
    public void setFillColor(Color c){
        fillColor = c;
    }

    public Color getFillColor(){
        return fillColor;
    }

    public abstract double getArea();    
    public abstract boolean isPointInside(Point p);
    
}