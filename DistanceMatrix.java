package Main;
import Main.DistanceMatrix;
import Main.Point;
import java.util.LinkedList;

import distancematrix.Matrix;

public class DistanceMatrix {
    private LinkedList<LinkedList<Double>> rows;
    private LinkedList<Point> cities;
    

    public void DistanceMatrix(){
    }

    public void addCity (double x, double y, String name){
        Point point1 = new Point(x, y, name);
        cities.addLast(point1);

    }
    
    public String getCityName (Integer index){
        return cities.get(index);
    }

    public Integer geyNoOfCities (){
        return cities.size();
    }

    public void createDistanceMatrix (){
        
    }

    public Real getDistance (Integer index1, Integer index2){

    }

}    
    /*public addPoint(Point p){
        p.getX();
        p.getY();

    }
}
*/