
public class TestPoint{
    public static void main (String[] args){
        Point point1 = new Point(4, 6, "point1");
        Point point2 = new Point(5, 8, "point2");

        double distance = point1.distance_bp (point2);

        double x = point1.getX();
        System.out.println(x);
        point1.setX(6);
        System.out.println(point1.getX());

        double y = point1.getY();
        System.out.println(y);
        point1.setY(8);
        System.out.println(point1.getY());

        String name = point1.getName();
        System.out.println(name);
        point1.setName("Hello");
        System.out.println(point1.getName());
    }
}

