public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private double resultDistance;

    public double distance () {
        resultDistance = distance (0,0);
        return resultDistance;
    }

    public double distance (Point point1) {
        resultDistance = distance (point1.x, point1.y);
        return resultDistance;
    }
    public double distance (int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        resultDistance = (double) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        return resultDistance;
    }
}
