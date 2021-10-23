import java.util.LinkedList;

public class DistanceMatrix {
    private LinkedList<LinkedList<Double>> rows;
    private LinkedList<Point> cities;
    

    public DistanceMatrix(){
        cities = new LinkedList<Point>();
        rows = new LinkedList<LinkedList<Double>>();
    }

    public void addCity (double x, double y, String name){
        Point point1 = new Point(x, y, name);
        cities.add(point1);
    }
    
    public String getCityName (Integer index){
        Point p = cities.get(0);
        return p.getName();
    }

    public Integer getNoOfCities (){
        return cities.size();
    }

    public void createDistanceMatrix (){
        Integer size = cities.size();
        
        for (int i = 0; i <= size; i++){
            for (int j = 0; j <= size; j++){
                int distance = .getDistance(i, j);


            }  
        }
        rows.add(add(distance));
    }

    public double getDistance (Integer index1, Integer index2){
        Point point1 = cities.get(index1);
        Point point2 = cities.get(index2);
        
        double distance = point1.distance_bp(point2);
        return distance;
    }

}    
    /*public addPoint(Point p){
        p.getX();
        p.getY();

    }
}
*/