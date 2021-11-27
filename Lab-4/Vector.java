public class Vector {
    public double vx, vy;

    //extends Point?

    public Vector(double vxi,double vyi){
        vx = vxi;
        vy = vyi;
    }

    public double crossProduct(Vector v1, Vector v2){
        double result = v1.vx*v2.vy - v1.vy*v2.vx;
        return result;
    }
}
