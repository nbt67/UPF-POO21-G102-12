import java.awt.Graphics;

public class Text extends Entity{
    private Point c;
    private String text;

    public Text (Point ci, String ti){
        c = ci;
        text = ti;
        //super()
    }

    public void draw(Graphics g) {
        //Color color1 = new Color (g.getColor());
        g.drawString(text, (int) Math.round(c.getY()), (int) Math.round(c.getX()));   
    }

    public void move(Vector v) {
        c.move(v.vx, v.vy);
    }

    public boolean isSelected(Point p) {
        return false;
    }

    public boolean isPointClose(Point p){
        return false;
    }
}
