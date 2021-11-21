public class City extends GeoPoint {
    private int numhab;

    public City(int xi, int yi, String n, int h){
        super(xi, yi, n);
        numhab = h;
    }

    public void draw(java.awt.Graphics g, double x, double y){
        
    }
}
