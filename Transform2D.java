public class Transform2D {
    public static double[] copy(double[] array) {
        double[] nwarray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            nwarray[i] = array[i];
        }
        return nwarray;
    }

    public static void scale(double[] x, double[] y, double alpha) {

        for (int i = 0; i < x.length; i++) {
            x[i] *= alpha;
            y[i] *= alpha;
        }
    }

    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i < x.length; i++) {
            x[i] += dx;
            y[i] += dy;
        }
    }

    public static void rotate(double[] x, double[] y, double theta) {
        double rad = Math.toRadians(theta);
        double temp;
        for (int i = 0; i < x.length; i++) {
            temp = x[i];
            x[i] = x[i] * Math.cos(rad) - y[i] * Math.sin(rad);
            y[i] = y[i] * Math.cos(rad) + temp * Math.sin(rad);
        }
    }

    public static void main(String[] args) {
        StdDraw.setScale(-5.0, +5.0);
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };

        // scale()
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);
        scale(x, y, 2.0);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);

        // translate()
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);
        translate(x, y, 2.0, 1.0);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);

        // rotate()
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);
        rotate(x, y, 45.0);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
    }
}

