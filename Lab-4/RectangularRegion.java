import java.util.*;

public class RectangularRegion extends PolygonalRegion{

    public RectangularRegion(Point p1, Point p2){
        super(new ArrayList <Point>(Arrays.asList(p1, p2)));

        //This is what Bernat wrote in class, idk if it's correct or it works with our code
    }

    public double getArea(){
        return 0.0;
    }
}
