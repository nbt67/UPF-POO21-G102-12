public class TestDistanceMatrix {
    public static void main (String[] args){
        DistanceMatrix matrix1 = new DistanceMatrix();
        
        matrix1.addCity(10.0, 20.0, "barcelona");
        matrix1.addCity(50.0, 10.0, "madrid");
        matrix1.addCity(40.0, 20.0, "paris");
        matrix1.addCity(80.0, 70.0, "londres");
        
        String st = matrix1.getCityName(0);       

        matrix1.createDistanceMatrix();
    }
}
