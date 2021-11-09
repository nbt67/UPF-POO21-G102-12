import java.util.LinkedList;

public class MyMap extends javax.swing.JPanel {

    private World myworld;

    public MyMap() {
        initComponents();

        LinkedList< Point > points1 = new LinkedList< Point >();
        points1.add( new Point( 10.0, 100.0 , "point1") );
        points1.add( new Point( 150.0, 10.0 , "point2") );
        points1.add( new Point( 290.0, 100.0 , "point3") );
        points1.add( new Point( 290.0, 200.0 , "point4") );
        points1.add( new Point( 150.0, 290.0 , "point5") );
        points1.add( new Point( 10.0, 200.0 , "point6") );

        LinkedList< Point > points2 = new LinkedList< Point >();
        points2.add( new Point( 20.0, 200.0 , "point1") );
        points2.add( new Point( 300.0, 20.0 , "point2") );
        points2.add( new Point( 580.0, 200.0 , "point3") );
        points2.add( new Point( 580.0, 400.0 , "point4") );
        points2.add( new Point( 300.0, 580.0 , "point5") );
        points2.add( new Point( 20.0, 400.0 , "point6") );

        LinkedList< Point > points3 = new LinkedList< Point >();
        points3.add( new Point( 300.0, 400.0 , "point1") );
        points3.add( new Point( 300.0, 500.0 , "point2") );
        points3.add( new Point( 400.0, 500.0 , "point3") );
        points3.add( new Point( 400.0, 400.0 , "point4") );

        LinkedList< Point > points4 = new LinkedList< Point >();
        points4.add( new Point( 10.0, 100.0 , "point1") );
        points4.add( new Point( 60.0, 100.0 , "point2") );
        points4.add( new Point( 60.0, 160.0 , "point3") );
        points4.add( new Point( 10.0, 160.0 , "point4") );

        LinkedList< PolygonalRegion > polygonalRegions1 = new LinkedList< PolygonalRegion >();
        polygonalRegions1.add(new PolygonalRegion(points1));
        polygonalRegions1.add(new PolygonalRegion(points2));

        LinkedList< PolygonalRegion > polygonalRegions2 = new LinkedList< PolygonalRegion >();
        polygonalRegions2.add(new PolygonalRegion(points3));
        polygonalRegions2.add(new PolygonalRegion(points4));

        LinkedList< Continent > myContinents = new LinkedList< Continent >();
        myContinents.add(new Continent(polygonalRegions1));
        myContinents.add(new Continent(polygonalRegions2));

        myworld = new World( myContinents );

        //System.out.println(myworld.getArea());
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
        myworld.draw( g , 1000, 1000); //The method draw(Graphics, double, double) in the type PolygonalRegion 
                          //is not applicable for the arguments (Graphics)
    }      

}

