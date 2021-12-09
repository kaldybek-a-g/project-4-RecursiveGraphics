public class Sierpinski {
    public static double height(double length) {
        return (Math.sqrt(3) / 2) * length;
    }

    public static void filledTriangle(double x, double y, double length) {
        double[] j = { x, x + (.5 * length), x - (.5 * length) };
        double[] k = { y, y + height(length), y + height(length) };
        StdDraw.filledPolygon(j, k);
        return;
    }

    public static void sierpinski(int n, double x, double y, double length) {
        if (n == 0) return;
        filledTriangle(x, y, length);
        sierpinski(n - 1, x, y + height(length), length / 2);
        sierpinski(n - 1, x + (length / 2), y, length / 2);
        sierpinski(n - 1, x - (length / 2), y, length / 2);
        
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double length = 1;
        double[] j = { 0, length, .5 };
        double[] k = { 0, 0, height(length) };
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(j, k);
        sierpinski(n, .5, 0, .5);

    }
}
