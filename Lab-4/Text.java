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
        
    }

    public void move(Vector v) {
        
    }

    public boolean isSelected(Point p) {
        return false;
    }

    public boolean isPointClose(Point p){
        return false;
    }
}
