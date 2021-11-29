public class CircularRegion extends EllipsoidalRegion{

    public CircularRegion(Point ci, double r){
        super(ci, r, r);
    }

    public double getArea(){
        double area = super.getArea();
        return area;
    }
}
