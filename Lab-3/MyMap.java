import java.util.*;

public class MyMap extends javax.swing.JPanel {

    private World myworld;
    private EllipsoidalRegion myEllipsoidalRegion;
    private Ocean myOcean;
    private Lake myLake;

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

        List< Point > points2 = new ArrayList<>();
        points2.add( new Point( 300.0, 300.0 , "squarePoint1") );
        points2.add( new Point( 400.0, 300.0 , "squarePoint2") );
        points2.add( new Point( 400.0, 400.0 , "squarePoint3") );
        points2.add( new Point( 300.0, 400.0 , "squarePoint4") );

        //Cities
        List< City > cities1 = new ArrayList<>();
        cities1.add(new City (800.0, 600.0, "Girona", 100));
        City capital1 = new City (800.0, 550.0, "BCN", 500);

        List< City > cities2 = new ArrayList<>();
        cities2.add(new City (200.0, 900.0, "Zaragoza", 150));
        City capital2 = new City (350.0, 900.0, "Madrid", 200);

        //Countries (PolygonalRegions)
        List< Country > polygonalRegions1 = new ArrayList<>();
        Country country1 = new Country(points1, capital1, "France", cities1);        
        polygonalRegions1.add(country1);
    
        List< Country > polygonalRegions2 = new ArrayList<>();
        Country country2 = new Country(points2, capital2, "Spain", cities2);   
        polygonalRegions2.add(country2);

        //Continents
        List< Continent > myContinents = new ArrayList<>();
        myContinents.add(new Continent(polygonalRegions1));
        myContinents.add(new Continent(polygonalRegions2));

        myContinents.get(0).getTotalArea();
        myContinents.get(1).getTotalArea();

        //EllipsoidalRegion
        Point p1 = new Point(200.0, 300.0, "point");
        myEllipsoidalRegion = new EllipsoidalRegion(p1, 100, 350);

        //Ocean
        List< Point > pointsOcean = new ArrayList<>();
        pointsOcean.add( new Point( 600.0, 600.0 , "oceanPoint1") );
        pointsOcean.add( new Point( 700.0, 600.0 , "oceanPoint2") );
        pointsOcean.add( new Point( 700.0, 700.0 , "oceanPoint3") );
        pointsOcean.add( new Point( 600.0, 700.0 , "oceanPoint4") );
        myOcean = new Ocean(pointsOcean);

        //Lake 
        List< Point > pointsLake = new ArrayList<>();
        pointsLake.add( new Point( 900.0, 500.0 , "lakePoint1") );
        pointsLake.add( new Point( 600.0, 600.0 , "lakePoint2") );
        pointsLake.add( new Point( 500.0, 700.0 , "lakePoint3") );
        pointsLake.add( new Point( 400.0, 500.0 , "lakePoint4") );
        myLake = new Lake(pointsLake);

        //World
        myworld = new World( myContinents );
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
        myOcean.draw(g, 100, 100);
        myLake.draw(g, 100, 100);
        myEllipsoidalRegion.draw(g, 100, 100);
        myworld.draw( g , 100, 100);
    }      
}