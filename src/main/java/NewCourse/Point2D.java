package NewCourse;

/**
 * Created by andrz on 11/10/2018.
 */
public class Point2D {

    protected  float x;
    protected  float y;

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public float distanceTO(Point2D other){
        float dx = other.x - this.x;
        float dy = other.y - this.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Point2D pl = new Point2D(10.5f, 15.4f);
        Point2D p2 = new Point2D(6.5f, 3.4f);

        System.out.println(p2.distanceTO(pl));

        System.out.println(pl.getX());
        System.out.println(p2.getY());
    }
}
