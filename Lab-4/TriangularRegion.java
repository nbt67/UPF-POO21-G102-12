import java.util.*;

public class TriangularRegion extends PolygonalRegion {

    public TriangularRegion (Point p1, Point p2, Point p3){
        super(new ArrayList <Point>(Arrays.asList(p1, p2, p3)));

        //This is what Bernat wrote in class, idk if it's correct or it works with our code

    }
    
    public double getArea(){
        return 0.0;
    }
}
