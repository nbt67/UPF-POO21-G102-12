import java.util.*;
import java.awt.Color;

public class MyWindow extends javax.swing.JFrame {

    public MyWindow() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
    }

    public static void main( String[] args ) {
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                MyWindow w = new MyWindow();
                EntityDrawer entityDrawer = new EntityDrawer();

                //Entity 1
                List< Point > points1 = new ArrayList<>();
                points1.add( new Point( 10.0, 100.0 , "hexagonPoint1") );
                points1.add( new Point( 150.0, 10.0 , "hexagonPoint2") );
                points1.add( new Point( 290.0, 100.0 , "hexagonPoint3") );
                points1.add( new Point( 290.0, 200.0 , "hexagonPoint4") );
                points1.add( new Point( 150.0, 290.0 , "hexagonPoint5") );
                points1.add( new Point( 10.0, 200.0 , "hexagonPoint6") );

                Color blue = new Color(0,255,255);
                Color black = new Color(0,0,0);
                Color green = new Color(124,252,0);

                PolygonalRegion e1 = new PolygonalRegion(points1);
                e1.setFillColor(blue);
                e1.setColor(black);

                entityDrawer.addDrawable(e1);

                //Text
                Point textPoint = new Point(200, 300, "pointtext");
                Text text1 = new Text(textPoint, "Hello :)");

                entityDrawer.addDrawable(text1);

                //Line
                Point linePoint1 = new Point(250, 350, "linePoint1");
                Point linePoint2 = new Point(200, 450, "linePoint2");
                Line line1 = new Line(linePoint1, linePoint2);

                line1.setColor(green);
                entityDrawer.addDrawable(line1);
                
                //Ellipsoidal Region
                Point ellipsePoint = new Point (400, 50, "ellipsePoint");
                EllipsoidalRegion ellipse1 = new EllipsoidalRegion(ellipsePoint, 30, 40);

                ellipse1.setFillColor(green);
                ellipse1.setColor(black);

                entityDrawer.addDrawable(ellipse1);

                w.add( entityDrawer );
                w.setVisible( true );
                w.pack();        
                System.out.println("Also, order your code in subfolders and use package of java to call it");
            }
        } );
    }
}