import java.util.LinkedList;

public class DistanceMatrix implements Matrix{
    private LinkedList<LinkedList<Double>> matrix;
    private LinkedList<Point> cities;
    

    public DistanceMatrix(){
        cities = new LinkedList<Point>();
        matrix = new LinkedList<LinkedList<Double>>();
    }

    public void addCity (double x, double y, String name){
        Point point = new Point(x, y, name);
        cities.add(point);
    }
    
    public String getCityName (int index){
        Point p = cities.get(0);
        return p.getName();
    }

    public int getNoOfCities (){
        return cities.size();
    }

    public void createDistanceMatrix (){
        int size = getNoOfCities();
        LinkedList<Double> distances = new LinkedList<Double>();
        double distance = 0;

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                distance = getDistance(i, j);
                distances.add(j, distance);                
            }
            matrix.add(i, distances);
        }
    }

    public double getDistance (int index1, int index2){
        Point point1 = cities.get(index1);
        Point point2 = cities.get(index2);
        
        double distance = point1.distance_bp(point2);
        return distance;
    }
}    