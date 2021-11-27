public class Color{
    private double x;
    private double y;
    private double z;
    private boolean isRGB;

    public Color(double xi, double yi, double zi, boolean rgb){
        x = xi;
        y = yi;
        z = zi;
        isRGB = rgb;
    }

    public void toHSV(){
        x = x / 255.0;
        y = y / 255.0;
        z = z / 255.0;

        double cmax = Math.max(x, Math.max(y, z)); // maximum of r, g, b
        double cmin = Math.min(x, Math.min(y, z)); // minimum of r, g, b
        double diff = cmax - cmin; 
        double h = -1, s = -1;
         
        if (cmax == cmin)
            h = 0;
        else if (cmax == x)
            h = (60 * ((y - z) / diff) + 360) % 360;
        else if (cmax == y)
            h = (60 * ((z - x) / diff) + 120) % 360;
        else if (cmax == z)
            h = (60 * ((x - y) / diff) + 240) % 360;
        if (cmax == 0)
            s = 0;
        else
            s = (diff / cmax) * 100;

        double v = cmax * 100;
        System.out.println("(" + h + " " + s + " " + v + ")");
        x = h;
        y = s;
        z = v;
        isRGB = false;
        // https://www.geeksforgeeks.org/program-change-rgb-color-model-hsv-color-model/
    }

    public void toRGB(){
        isRGB = true;
    }

}
