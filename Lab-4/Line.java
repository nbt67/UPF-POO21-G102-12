public class Line extends Entity{
    Point p1, p2;

    public Line(Point pi1, Point pi2){
        super();
        p1 = pi1;
        p2 = pi2;
    }

    public void draw(java.awt.Graphics g){
        g.drawLine((int) Math.round(p1.getX()), (int) Math.round(p1.getY()), (int) Math.round(p2.getX()), (int) Math.round(p2.getY()));
    }

    public void move (Vector v){
        p1.move(v.vx, v.vy);
        p2.move(v.vx, v.vy);
    }

    public boolean isPointClose(Point p){
        return false;
    }

    public boolean isSelected(Point p){
        return false;
    }
}
