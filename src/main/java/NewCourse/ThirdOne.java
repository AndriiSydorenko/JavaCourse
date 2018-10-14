package NewCourse;

import java.util.Scanner;

/**
 * Created by andrz on 07/10/2018.
 */
public class ThirdOne {

    public static void main(String[] args) {

        {
            System.out.println("Input coordinates");
            Scanner con = new Scanner(System.in);

            double x1 = con.nextDouble();
            double y1 = con.nextDouble();
            double z1 = con.nextDouble();
            double x2 = con.nextDouble();
            double y2 = con.nextDouble();
            double z2 = con.nextDouble();

            double res =  Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1) + (z2 - z1)*(z2 - z1));

            System.out.printf("Длинна вектора " + x2 + y2 + z2 + " =\n" + res);

            con.close();

        }

    }

      /*  System.out.println("Длина вектора" + VectorLong(3.2, 0.0, 8.1) );

    }

    public static double VectorLong( double x, double y, double z) {

       double  res = Math.sqrt((x2 * x1) + (y2* y1) + (z2 * z1));
        return x;
        return y;
        return z;
    }*/

}


