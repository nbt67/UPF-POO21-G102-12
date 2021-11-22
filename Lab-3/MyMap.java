import java.util.*;

public class MyMap extends javax.swing.JPanel {

    private World myworld;

    public MyMap() {
        initComponents();

        //Points
        List< Point > points1 = new ArrayList<>();
        points1.add( new Point( 10.0, 100.0 , "hexagonPoint1") );
        points1.add( new Point( 150.0, 10.0 , "hexagonPoint2") );
        points1.add( new Point( 290.0, 100.0 , "hexagonPoint3") );
        points1.add( new Point( 290.0, 200.0 , "hexagonPoint4") );
        points1.add( new Point( 150.0, 290.0 , "hexagonPoint5") );
        points1.add( new Point( 10.0, 200.0 , "hexagonPoint6") );

        List< Point > points2 = new ArrayList< >();
        points2.add( new Point( 300.0, 300.0 , "squarePoint1") );
        points2.add( new Point( 400.0, 300.0 , "squarePoint2") );
        points2.add( new Point( 400.0, 400.0 , "squarePoint3") );
        points2.add( new Point( 300.0, 400.0 , "squarePoint4") );

        //PolygonalRegions
        List< Country > polygonalRegions1 = new ArrayList<>();
        polygonalRegions1.add( new Country(points1, new City (10.0, 10.0, "BCN", 1000) ));

        List< Country > polygonalRegions2 = new ArrayList<>();
        polygonalRegions2.add( new Country(points2, new City (20.0, 20.0, "Madrid", 2000) ));

        //Continents
        List< Continent > myContinents = new ArrayList<>();
        myContinents.add(new Continent(polygonalRegions1));
        myContinents.add(new Continent(polygonalRegions2));

        myContinents.get(0).getTotalArea();
        myContinents.get(1).getTotalArea();

        //World
        myworld = new World( myContinents );

        System.out.println("look up for java doc");

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
        GeoPoint myOval = new GeoPoint(50.0, 60.0, "hola");
        myOval.draw(g, 50, 60);
        myworld.draw( g , 1000, 1000);
    }      
}