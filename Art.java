public class Art {
    public static void drawC(double x, double y, double r) {
        StdDraw.setPenColor(StdDraw.PINK);
        StdDraw.filledCircle(x, y, r / 4);
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.circle(x, y, r / 4);
    }

    public static void draw(int n, double x, double y, double r) {
        if (n == 0) return;
        drawC(x, y, r);
        draw(n - 1, x - r / 2, y - r / 2, r / 2);
        draw(n - 1, x - r / 2, y + r / 2, r / 2);
        draw(n - 1, x + r / 2, y - r / 2, r / 2);
        draw(n - 1, x + r / 2, y + r / 2, r / 2);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        draw(n, .5, .5, .5);
    }

}
