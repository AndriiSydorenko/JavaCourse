package NewCourse;

/**
 * Created by andrz on 02/10/2018.
 */
public class FirstOne {
    public static void main(String[] args) {
    FirstOne result = new FirstOne();
        result.First();
        result.Second();
        result.Third();
        result.Fourth();

    }
    public static void First() {
        int x = 3;
        int y = 5;
        int z = 6;
        int n = 7;
        System.out.println((x - (50 + y * z) * n) + x);

    }
    public static void Second(){
        float x = 3f;
        float y = 5f;
        float z = 6f;
        float n = 7f;
        System.out.println(x * (y / (z-1) + 555) - n);
    }
    public static void Third(){
        long x = 3l;
        long y = 5l;
        long z = 6l;
        long n = 7l;
        System.out.println(x + (y - 100) * z / n);
    }
    public static void Fourth(){
        double x = 3d;
        double y = 5d;
        double z = 6d;
        double n = 7d;
        System.out.println(-x / y + z * (n+1));
    }
}
