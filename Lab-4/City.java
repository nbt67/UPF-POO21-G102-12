public class City extends GeoPoint {
    private int numhab;

    public City(double xi, double yi, String n, Integer h){
        super(xi, yi, n);
        numhab = h;
    }

    public void draw(java.awt.Graphics g, double x, double y){
        super.draw(g, 100, 100);
    }
}
