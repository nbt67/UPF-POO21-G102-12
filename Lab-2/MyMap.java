import java.util.LinkedList;

public class MyMap extends javax.swing.JPanel {

    private PolygonalRegion region;

    public MyMap() {
        initComponents();

        LinkedList< Point > points = new LinkedList< Point >();
        points.add( new Point( 10.0, 100.0 , "point1") );
        points.add( new Point( 150.0, 10.0 , "point1") );
        points.add( new Point( 290.0, 100.0 , "point1") );
        points.add( new Point( 290.0, 200.0 , "point1") );
        points.add( new Point( 150.0, 290.0 , "point1") );
        points.add( new Point( 10.0, 200.0 , "point1") );
        
        region = new PolygonalRegion( points );
        System.out.println( region.getArea() );

    }

    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
    }

    public void paint( java.awt.Graphics g ) {
        super.paint( g );
        region.draw( g ); //The method draw(Graphics, double, double) in the type PolygonalRegion 
                          //is not applicable for the arguments (Graphics)
    }      

}

