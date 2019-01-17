package jp.ac.uryukyu.ie.e185706;

import java.util.Scanner;

/*　入力専用メソッド */

public class InputWord {

    public static String Scan() {
        Scanner scan = new Scanner(System.in);
        String TheChoice = scan.next();
        return  TheChoice;
    }

}

