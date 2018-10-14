package NewCourse;

/**
 * Created by andrz on 03/10/2018.
 */
public class SecondOne {
    public static void main(String[] args) {


        System.out.println(Res(12345));
    }

        public static int Res( int y){



            int x = y%10;
            //y%=10;
            System.out.println(y);

            System.out.println(x);

            y /= 10;
            System.out.println(y%=10);


            System.out.println(y%=10);


            System.out.println(y%=10);

        return  y;
    }









}
