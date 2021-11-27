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

                Color fillColor = new Color(0,255,255);
                Color lineColor = new Color(0,0,0);

                PolygonalRegion e1 = new PolygonalRegion(points1);
                e1.setFillColor(fillColor);
                e1.setColor(lineColor);


                entityDrawer.addDrawable(e1);

                w.add( entityDrawer );
                w.setVisible( true );
                w.pack();        
                System.out.println("Also, order your code in subfolders and use package of java to call it");
            }
        } );
    }
}