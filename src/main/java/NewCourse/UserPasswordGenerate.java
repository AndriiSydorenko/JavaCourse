package NewCourse;

import sun.plugin2.message.JavaScriptCallMessage;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by andrz on 07/10/2018.
 */
public class UserPasswordGenerate {

    public static final String SYMBOLS = "!@#$%^&";
    public static final String LETTERS = "ASDFGqwert";
    public static final String DIGITS = "123456789";
    public static final Random RANDOM = new Random();
    public static final int SYMBOL_GROUP = 0;
    public static final int LETTER_GROUP = 1;
    public static final int DIGIT_GROUP = 2;
    public static void main(String[] args) {

        System.out.println(generate(20));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input count symbols in the password from 8 till 20");
        int num = scanner.nextInt();
        if(num >= 8 && num <= 20){
            String pass = generate(num);
            System.out.println("Here's your passwod: " + pass);
        }

    }
    public  static String generate(int num) {
        StringBuilder password = new StringBuilder();
        boolean flag = false;
        int num_count = 0;
        char letter = 0;

        while (password.length() < num) {
            int group = RANDOM.nextInt(3);
            switch (group){
                case SYMBOL_GROUP:
                    if(flag == false){
                    //password.append(randomChar(SYMBOLS));
                        letter = randomChar(SYMBOLS);
                    flag = true;
                    }
                    break;
                case LETTER_GROUP:
                    letter = randomChar(LETTERS);

                    break;
                case DIGIT_GROUP:
                    if (num_count < 3) {
                        letter = randomChar(DIGITS);
                        //password.append(randomChar(DIGITS));
                        num_count++;
                    }
                    break;
            }
            if(password.length() == 0 || password.charAt(password.length() - 1) != letter ){
                password.append(letter);

            }
        }
        return password.toString();
    }

    public static char randomChar(String s){
      //  Random random = new Random();
        int index = RANDOM.nextInt(s.length());
        return  s.charAt(index);

    }
}
